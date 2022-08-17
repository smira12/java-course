package by.it_academy.lesson15;

import java.math.BigInteger;
import java.text.DecimalFormat;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.stream.LongStream;

public class Factorial {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newWorkStealingPool();
        Future<BigInteger> future = service.submit(() -> LongStream.rangeClosed(1, 100000)
                .parallel()
                .mapToObj(BigInteger::valueOf)
                .reduce(BigInteger.ONE, BigInteger::multiply));
        service.shutdown();

        System.out.println(new DecimalFormat("0.###E0").format(future.get()));
    }
}