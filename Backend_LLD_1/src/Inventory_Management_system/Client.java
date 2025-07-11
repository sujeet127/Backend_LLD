package Inventory_Management_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Client {
    public static void main(String[] args) {
        List<Item> items = new ArrayList<>();
        items.add(new Electronics(2, "E1", "Laptop", 45000.99, 5));

        items.add(new Clothing("M", "C1", "T-shirt", 1100.99, 10));

        items.add(new Book("Sujeet", "B1", "Mathematics", 450.99, 23));

//        Collections.sort(items);
//        for(Item item : items) {
//            System.out.println(item);
//        }
        System.out.println("List of Items:");

        items.forEach(System.out::println);
        Inventory<Electronics> electronic = new Inventory<>();
        Inventory<Clothing> clothing = new Inventory<>();
        Inventory<Book> book = new Inventory<>();

        //electronic.add(new Electronics(2,"E1","Laptop",45000.99,5));
        Electronics laptop = new Electronics(24, "E1", "Laptop", 55000.99, 5);
        Electronics mobile = new Electronics(12, "E2", "Mobile", 23000.99, 15);
        Electronics earphone = new Electronics(6, "E3", "Earphone", 2500.99, 10);

        Clothing tShirt = new Clothing("M", "C1", "T-shirt", 1100.99, 10);
        Clothing pant = new Clothing("32", "C2", "Pant", 800.99, 15);
        Clothing sherwani = new Clothing("L", "C3", "Sherwani", 5000.00, 10);

        Book science = new Book("Sujeet", "B1", "Science", 300.99, 5);
        Book Chemistry = new Book("Agarwal", "B2", "Chemistry", 350.99, 10);
        Book Mathematics = new Book("RD Sharma", "B3", "Mathematics", 500.99, 10);

        electronic.addItem(laptop);
        electronic.addItem(mobile);
        electronic.addItem(earphone);

        clothing.addItem(tShirt);
        clothing.addItem(pant);
        clothing.addItem(sherwani);

        book.addItem(science);
        book.addItem(Chemistry);
        book.addItem(Mathematics);

        electronic.removeItem("E2");
        System.out.println("Printing list of items in inventory:");

        List<Electronics> listOFItems = electronic.getAllItems();
        for (Item i : listOFItems) {
            System.out.println(i.getName());
        }

        //test order and orderProcessor
        ProcessOrder processOrder = new ProcessOrder();
        processOrder.addOrder(new Order("01", true));
        processOrder.addOrder(new Order("02", true));
        processOrder.addOrder(new Order("03", false));
        processOrder.addOrder(new Order("04", true));
        processOrder.addOrder(new Order("05", false));
        processOrder.addOrder(new Order("06", true));
        processOrder.addOrder(new Order("07", false));
        processOrder.addOrder(new Order("08", false));

        while (processOrder.getSize() > 0) {
            System.out.println(processOrder.processOrder());
        }

        //testing sorting and filtering
        Inventory<Item> inventory = new Inventory<>();
        inventory.addItem(laptop);
        inventory.addItem(mobile);
        inventory.addItem(earphone);
        inventory.addItem(science);
        inventory.addItem(Chemistry);
        inventory.addItem(Mathematics);
        inventory.addItem(science);
        inventory.addItem(Chemistry);
        inventory.addItem(science);

        List<Item> affordableItems = inventory.filterByPrice(0.0, 3000.0);
        System.out.println("Printing affordable list of items:");

        for (Item i : affordableItems) {

            System.out.println(i);
        }

        // List<Item>nameFilter=inventory.filterByName("Laptop");

        List<Item> sortedItemByName = inventory.SortItem(new ItemNameComparator());
        System.out.println("Printing sorted Item By Name:");
        for (Item i : sortedItemByName) {
            System.out.println(i);
        }

        List<Item> sortedByQuantity = inventory.SortItem(new ItemQuantityComparator());
        System.out.println("Printing sorted Item By Quantity in descending order:");
        for (Item i : sortedByQuantity) {
            System.out.println(i);
        }

        //testing wishlist
        Wishlist wishlist = new Wishlist();
        wishlist.addToWishlist(laptop);
        wishlist.addToWishlist(mobile);
        wishlist.addToWishlist(earphone);
        wishlist.addToWishlist(laptop);
        System.out.println("Printing Wishlist:");

        wishlist.getWishlist().forEach(System.out::println);

        //task1: use of map
        System.out.println("Task1 :");
        List<Item> inventoryItems = inventory.getAllItems();
        System.out.println("Printing all inventory ID using Map:");
        inventoryItems.stream()
                .map(x -> x.getId())
                .forEach(System.out::println);

        System.out.println("Printing list of Item name in lower case:");
        List<String> l1 = inventoryItems.stream()
                .map(x -> x.getName().toLowerCase())
                .collect(Collectors.toList());
        System.out.println(l1);

        System.out.println("Generate a list of the lengths of item names:");
        List<Integer> l2 = inventoryItems.stream()
                .map(item -> item.getName().length())
                .collect(Collectors.toList());
        System.out.println(l2);

        //task2:filtering and matching
        System.out.println("Task2 :");

        //Find all items priced above 1000 and print their details.
        System.out.println("Find all items priced above 1000 and print their details:");
        inventoryItems.stream()
                .filter(item -> item.getPrice() > 1000)
                .forEach(System.out::println);
        System.out.println("Check if any item in the inventory has a quantity of 0");
        boolean isItemOutOfStock = inventoryItems.stream()
                .anyMatch(item -> item.getQuantity() == 0);
        System.out.println("isItemOutOfStock: " + isItemOutOfStock);

        System.out.println("Verify that all items have a price greater than 0");
        boolean isAllIteamPriced = inventoryItems.stream()
                .allMatch(item -> item.getPrice() > 0);
        System.out.println("isAllIteamPriced: " + isAllIteamPriced);

        System.out.println("Confirm that no item has a negative quantity:");
        boolean noneMatchforNegativeQuantity = inventoryItems.stream()
                .noneMatch(item -> item.getQuantity() < 0);
        System.out.println("noneMatchforNegativeQuantity: " + noneMatchforNegativeQuantity);

        //task 3
//        Assume the inventory contains various items (e.g., electronics, clothing, books) with attributes like name, price, quantity.
//        Write a program to achieve the following using a single stream pipeline:
//        Filter items with a price greater than 1000 and a quantity greater than 0 (available stock).
//        Extract only the names of these items.
//        Remove duplicate names (if any).
//        Sort the names in alphabetical order.
//        Limit the result to the top 5 names.
//        Collect the final list into a List<String> and print it.
        System.out.println("Task3 :");

        List<String> l3 = inventoryItems.stream()
                .filter(item -> item.getPrice() > 1000 && item.getQuantity() > 0)
                .map(Item::getName)
                .distinct()
                .sorted(String::compareTo)
                .limit(5)
                .collect(Collectors.toList());
        System.out.println(l3);

//        Task 4: Reduce for Aggregation
//        Goal: Use reduce (Java Stream.reduce() - Scaler Topics) to aggregate data in a stream.
//        Practice:
//        Calculate the total quantity of all items in the inventory.
//        Find the most expensive item using reduce.
//                Concatenate all item names into a single comma-separated string.

        System.out.println("Task4 :");

        Integer totalQuntity=inventoryItems.stream()
                .map(item -> item.getQuantity())
                .reduce(0,(accumulator,x)->accumulator+=x );
        System.out.println("totalQuntity: " + totalQuntity);

        Optional<Item> mostExpensiveItem=inventoryItems.stream()
                .reduce((item1,item2)-> item1.getPrice()>item2.getPrice()?item1:item2);
        mostExpensiveItem.ifPresent(item -> System.out.println("mostExpensiveItem: " + item));


//       StringBuilder sb=new StringBuilder();
//        inventoryItems.stream().map(Item::getName).forEach(x->sb.append(x+","));
//        System.out.println("using string builder: "+sb); //optimized
//        String finalString1=inventoryItems.stream()
//                .map(i->i.getName())
//                .collect(Collectors.joining(","));
//        System.out.println("finalString1: " + finalString1); //optimized

        Optional<String> finalString=inventoryItems.stream().map(Item::getName)
                .reduce((str,x)->str+","+x);
        System.out.println("finalString: " + finalString.get());

//        Task 5: Custom Exceptions
//        Goal: Create and use custom exceptions for domain-specific errors.
//        Practice:
//        Define an InvalidQuantityException to handle cases where an item’s quantity is set to a negative value.
//        Implement a DuplicateItemException for scenarios where an item with the same ID is added to the inventory.
//        Use these exceptions in addItem and updateItem methods of the Inventory class.
//        Create DuplicateItemException as unchecked and InvalidQuantityException as checked
        System.out.println("Task5 :");


    }
}
