package main.DesignPatternAndPrinciples.Singleton.singletonDesign_2;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {

        // 2.issue:
        //in multi-threaded environment multiple thread can enter crical section and create multiple object
        ExecutorService ex= Executors.newCachedThreadPool();
        for(int i=0;i<100;i++){
            int num=i;
            ex.execute(()->{
                DBconnectPool dbConnect=DBconnectPool.getConnection();
                //System.out.println("number: "+num+" "+Thread.currentThread().getName());
            });
        }

    }

}
