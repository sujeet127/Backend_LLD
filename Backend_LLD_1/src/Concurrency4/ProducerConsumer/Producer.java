package Concurrency4.ProducerConsumer;

public class Producer implements Runnable {
    Item item;
    private int MAX_SIZE ;
    Producer(Item item,int capacity){
        this.item = item;
        MAX_SIZE = capacity;
    }
    public void produceItem(){
        while(true){
            if( item.getSize()<MAX_SIZE){
                item.addItem(new Item());
                System.out.println("Producer produced an item: "+"Item size is "+item.getSize());
            }
        }
    }

    @Override
    public void run() {
        produceItem();
    }
}
