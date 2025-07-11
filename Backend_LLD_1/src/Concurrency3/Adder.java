package Concurrency3;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Adder implements Callable<Void> {
    private Value value;
    Lock lock;
    public Adder(Value value,Lock lock) {

        this.value = value;
        this.lock = lock;
    }
    @Override
    public Void call() throws Exception {
        for (int i = 1; i <= 100; i++) {

                lock.lock();
                System.out.println("Adding: "+i+" in "+value.getValue());
                value.setValue(value.getValue()+i);
                lock.unlock();




        }
        return null;
    }
}
