package com.aiminding.study.demo.java8;

import com.beust.jcommander.internal.Lists;
import org.testng.collections.CollectionUtils;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.stream.Collectors;

public class CompletableFutureTest2 {

    static void sleep(int millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    static void executionThread(){
        System.out.println("Thread execution - " + Thread.currentThread().getName());
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<List<String>> completableFuture1 = CompletableFuture.supplyAsync(() -> {
            sleep(2000);
            List<String> result = Lists.newArrayList("1","2");
            System.out.println("----\nsupplyAsync first future - " + result.toString());
            executionThread();
            return result;
        });

        CompletableFuture<List<String>> completableFuture2 = CompletableFuture.supplyAsync(() -> {
            sleep(1000);
            List<String> result = Lists.newArrayList("1","4");
            System.out.println("----\nsupplyAsync second future - " + result.toString());
            executionThread();
            return result;
        });

        List<CompletableFuture<List<String>>> completableFutures = Arrays.asList(completableFuture1, completableFuture2);

        System.out.println(completableFutures.size());

        CompletableFuture<Void> resultantCf = CompletableFuture.allOf(completableFutures.toArray(new CompletableFuture[completableFutures.size()]));

        CompletableFuture<List<List<String>>> allFutureResults = resultantCf.thenApply(t -> completableFutures.stream().map(CompletableFuture::join).collect(Collectors.toList()));

        List<List<String>> lists = null;
        try {
            lists = allFutureResults.get(3000, TimeUnit.MILLISECONDS);
        } catch (TimeoutException e) {
            e.printStackTrace();
            System.out.println("Result - " + 0);
        }
        int size  = lists.size();
        if (2 == size) {
            System.out.println("22");
            List<String> strings = lists.get(0);
            System.out.println(strings);
            List<String> strings2 = lists.get(1);
            System.out.println(strings2);

            List<String> inter = strings.stream().filter(strings2::contains).collect(Collectors.toList());
            System.out.println("真实结果：" + inter);

        }
    }
}
