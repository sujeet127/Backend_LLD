package Concurrency4.ProducerConsumerSync;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private int maxSize;
    List<Object> items;
    Store(int size) {
        maxSize=size;
        items=new ArrayList<Object>();
    }

    public void addItem(Object item) {
        this.items.add(item);
        System.out.println("Producer produced an Item : "+items.size());
    }
    public void removeItem() {
        items.removeLast();
        System.out.println("Consumer consumed an Item : "+items.size());
    }

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public List<Object> getItem() {
        return items;
    }

}
