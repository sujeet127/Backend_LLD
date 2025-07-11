package Concurrency4.ProducerConsumerSync;

public class Consumer implements Runnable {
    private Store store;

    Consumer(Store store) {
        this.store = store;
    }

    public void run() {
        while (true) {
            synchronized (store) {

                if (store.getItem().size() > 0) {
                    store.removeItem();
                }
            }
        }
    }
}
