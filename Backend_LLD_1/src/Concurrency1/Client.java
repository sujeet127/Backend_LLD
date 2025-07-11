package Concurrency1;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
public class Client {
    public static void main(String[] args) {
            HelloWorldPrinter helloWorldPrinter = new HelloWorldPrinter();
            helloWorldPrinter.print();
            Thread thread = new Thread(helloWorldPrinter);
            thread.start();
            //print 1-100 in different thread
        for(int i=1;i<=100;i++){
            Thread thread1 = new Thread(new NumberPrinter(i));
            thread1.start();
        }

        //using lamda
        ExecutorService executor=Executors.newCachedThreadPool();
        ExecutorService ex=Executors.newFixedThreadPool(10);



        for(int i=1;i<=10000;i++){
            int number = i;
            Callable r=()->{System.out.println("Number: "+number+" -" + Thread.currentThread().getName());
             return number;};

            executor.submit(r);
        }
        new Thread(()->System.out.println("Done")).start();
    }
}
