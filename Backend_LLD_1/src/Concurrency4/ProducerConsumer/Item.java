package Concurrency4.ProducerConsumer;

import java.util.ArrayList;
import java.util.List;

public class Item {
    private List<Item> items;
    public Item() {
        items = new ArrayList<>();
    }
    public Item(List<Item> items) {
        this.items = items;
    }
    public   void addItem(Item item) {
        items.add(item);
    }
    public List<Item> getItems() {
        return items;
    }
    public  int getSize() {
        return items.size();
    }
    public  void  removeItem() {
        items.removeLast();
    }
    public void printItems() {
        for (Item item : items) {
            System.out.println(item);
        }
    }

}
