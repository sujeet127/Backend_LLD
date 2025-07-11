package Concurrency3;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.*;


public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Lock lock =new ReentrantLock();
        Value value = new Value();

        Adder adder=new Adder(value,lock);
        Substractor substractor=new Substractor(value,lock);
        ExecutorService executorService= Executors.newCachedThreadPool();
        Future<Void> adderFuture =executorService.submit(adder);
        Future<Void>substractorFuture =executorService.submit(substractor);

        adderFuture.get();
        substractorFuture.get();
        System.out.println("Final value after Adder-Subsractor C3: "+value.getValue());
    }
}
