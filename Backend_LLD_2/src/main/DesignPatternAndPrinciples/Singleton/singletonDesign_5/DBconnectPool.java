package main.Singleton.singletonDesign_5;

import java.util.concurrent.locks.Lock;

public class DBconnectPool {
    private static volatile DBconnectPool instance = null;

    // Private constructor
    private DBconnectPool() {
        System.out.println("Creating instance: " + Thread.currentThread().getName());
    }

    // Thread-safe double-check locking
    public static DBconnectPool getConnection(Lock lock){
        //double checkicg lock
        if(instance == null){
            lock.lock();
            if(instance == null){
                instance = new DBconnectPool();
                //System.out.println("instance:"+instance);
            }
            lock.unlock();

        }
        //System.out.println("instance:"+instance);
        return instance;
    }
//    public static DBconnectPool getConnection() {
//        if (instance == null) {
//            synchronized (DBconnectPool.class) {
//                if (instance == null) {
//                    instance = new DBconnectPool();
//                }
//            }
//        }
//        return instance;
//    }
}
