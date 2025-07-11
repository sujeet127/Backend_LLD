package Concurrency4.ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Store store;
    private Semaphore producerSemaphore,consumerSemaphore;
    Producer(Store store,Semaphore producerSemaphore,Semaphore consumerSemaphore) {
        this.store=store;
        this.producerSemaphore=producerSemaphore;
        this.consumerSemaphore=consumerSemaphore;
    }
    public void run() {
        while (true) {
//            synchronized (store)
//            {
//                if(store.getItem().size()<store.getMaxSize()){
//                    store.addItem(new Object());
//                }
//            }
            try {
                producerSemaphore.acquire();
                store.addItem(new Object());
                consumerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
