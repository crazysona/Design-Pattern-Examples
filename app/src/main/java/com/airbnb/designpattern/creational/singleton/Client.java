package com.airbnb.designpattern.creational.singleton;

import com.google.common.collect.ImmutableList;

import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;
import java.util.stream.IntStream;

public class Client {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(16);
    ImmutableList<Future<Singleton>> futures =
        IntStream.range(0, 100)
            .mapToObj(i -> executorService.submit(Singleton::getInstance))
            .collect(ImmutableList.toImmutableList());
    long cnt = futures.stream().map(getFutureResult()).filter(Objects::nonNull).distinct().count();
    System.out.println(String.format("Total number is %d", cnt));
    executorService.shutdown();
    try {
      if (!executorService.awaitTermination(800, TimeUnit.MILLISECONDS)) {
        executorService.shutdownNow();
      }
    } catch (InterruptedException e) {
      executorService.shutdownNow();
    }
  }

  private static Function<Future<Singleton>, Singleton> getFutureResult() {
    return f -> {
      try {
        return f.get(100, TimeUnit.MILLISECONDS);
      } catch (Exception e) {
        e.printStackTrace();
      }
      return null;
    };
  }
}
