package Concurrency4.ProducerConsumerSemaphores;

import java.util.concurrent.Semaphore;

public class Consumer implements Runnable {
    private Store store;
    private Semaphore producerSemaphore,consumerSemaphore;

    Consumer(Store store,Semaphore producerSemaphore,Semaphore consumerSemaphore) {
        this.store = store;
        this.producerSemaphore = producerSemaphore;
        this.consumerSemaphore = consumerSemaphore;
    }

    public void run() {
        while (true) {
//            synchronized (store) {
//
//                if (store.getItem().size() > 0) {
//                    store.removeItem();
//                }
//            }
            try {
                consumerSemaphore.acquire();
                store.removeItem();
                producerSemaphore.release();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
