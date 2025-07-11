package main.DesignPatternAndPrinciples.Singleton.singletonDesign_5;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        ExecutorService ex= Executors.newFixedThreadPool(5);
        for(int i=0;i<100;i++){
            int num=i;
            ex.execute(() -> {
               DBconnectPool.getConnection(lock);
                System.out.println("Thread: " + Thread.currentThread().getName());
            });
        }
        ex.shutdown();
    }
}
