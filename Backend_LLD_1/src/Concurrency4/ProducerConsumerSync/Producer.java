package Concurrency4.ProducerConsumerSync;

public class Producer implements Runnable {
    private Store store;
    Producer(Store store) {
        this.store=store;
    }
    public void run() {
        while (true) {
            synchronized (store)
            {
                if(store.getItem().size()<store.getMaxSize()){
                    store.addItem(new Object());
                }
            }
        }
    }
}
