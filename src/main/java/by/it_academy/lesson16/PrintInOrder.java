package by.it_academy.lesson16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.*;
import java.util.stream.Collectors;

/**
 * Необходимо синхронизировать класс PrintInOrder, таким образом, чтобы 3 потока всегда
 * печатали 123 последовательно.
 * Подсказка: у меня получилось с помощью двух CountDownLatch.
 *
 * @author Maxim Tereshchenko
 */
class PrintInOrder {
    private final CountDownLatch second = new CountDownLatch(1);
    private final CountDownLatch third = new CountDownLatch(1);

    private final List<String> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        try {
            for (int i = 0; i < 1000; i++) {
                PrintInOrder printInOrder = new PrintInOrder();
                List<Runnable> tasks = new ArrayList<>();
                tasks.add(printInOrder::first);
                tasks.add(printInOrder::second);
                tasks.add(printInOrder::third);
                Collections.shuffle(tasks);
                List<? extends Future<?>> futures = tasks.stream()
                        .map(executorService::submit)
                        .collect(Collectors.toList());
                for (Future<?> future : futures) {
                    future.get();
                }
                printInOrder.verify();
            }
        } finally {
            executorService.shutdown();
            executorService.awaitTermination(1, TimeUnit.SECONDS);
        }
    }

    public void first() {
        list.add("1");
        second.countDown();
    }

    public void second() {
        try {
            second.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        list.add("2");
        third.countDown();
    }

    public void third() {
        try {
            third.await();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        list.add("3");
    }

    public void verify() {
        if (!Arrays.asList("1", "2", "3").equals(list)) {
            throw new RuntimeException("Expected [1, 2, 3] but was " + list);
        }
    }
}
