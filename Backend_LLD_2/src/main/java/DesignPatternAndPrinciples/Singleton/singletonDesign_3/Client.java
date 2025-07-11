package main.DesignPatternAndPrinciples.Singleton.singletonDesign_3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService ex= Executors.newCachedThreadPool();
        for(int i=0;i<100;i++){
            int num=i;
            ex.execute(()->{
                DBconnectPool.getConnection();
               // System.out.println("number: "+num+" "+Thread.currentThread().getName());
            });
        }



    }

}
