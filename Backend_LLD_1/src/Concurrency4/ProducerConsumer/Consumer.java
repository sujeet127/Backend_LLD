package Concurrency4.ProducerConsumer;

public class Consumer implements  Runnable{
    Item item;
    Consumer(Item item) {
        this.item = item;
    }
    public void consumeItem() {
        while(true){
            if(item.getSize()>0){
                item.removeItem();  //remove last element
                System.out.println("Consumed an Item: "+"remaining Item: "+item.getSize());
            }
        }
    }
    public void run(){
        consumeItem();
    }
}
