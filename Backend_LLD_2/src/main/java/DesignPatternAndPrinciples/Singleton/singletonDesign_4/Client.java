package main.DesignPatternAndPrinciples.Singleton.singletonDesign_4;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        //object is created during class loaded ,
        ExecutorService ex= Executors.newFixedThreadPool(5);
        for(int i=0;i<100;i++){
            int num=i;
            ex.execute(() -> {
                DBconnectPool.getConnection();
                System.out.println("Thread: " + Thread.currentThread().getName());
            });
        }
        ex.shutdown();

    }

}
