package Concurrency4.ProducerConsumer;

public class Client {
    public static void main(String[] args) {
            Item item=new Item();
//            Consumer consumer = new Consumer(item);
//            Producer producer=new Producer(item,5);
//            ExecutorService executor = Executors.newFixedThreadPool(5);
//            executor.execute(consumer);
//            executor.execute(producer);
         for(int i=0;i<8;i++){
             Producer producer1=new Producer(item,5);
             new Thread(producer1).start();
         }
         for(int i=0;i<8;i++){
             Consumer consumer1=new Consumer(item);
             new Thread(consumer1).start();
         }
    }
}
