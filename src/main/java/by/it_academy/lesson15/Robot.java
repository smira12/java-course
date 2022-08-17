package by.it_academy.lesson15;

import java.util.Arrays;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Robot implements Runnable {
    private final String name;
    private int delay;
    private final String actions;

    Robot(String name, int delay, String actions) {

        this.name = name;
        this.delay = delay;
        this.actions = actions;
    }

    @Override
    public void run() {
        Vector vector = new Vector();
        int[] position = new int[]{0, 0};
        for (int i = 0; i < actions.length(); i++) {
            if (actions.charAt(i) == 'F') {
                vector.apply(position);
            } else if (actions.charAt(i) == 'L') {
                vector = vector.left();
            } else if (actions.charAt(i) == 'R') {
                vector = vector.right();
            }
            System.out.println("Name: " + name + " position " + Arrays.toString(position));
        }
    }
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();

        executorService.submit(new Robot("Joe", 3, "DYRTWFDYTEG"));
        executorService.submit(new Robot("Bill", 1, "LKJOIKONI"));
        executorService.submit(new Robot("Jim", 2, "HYTVNBFDU"));

        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.HOURS);
    }
}