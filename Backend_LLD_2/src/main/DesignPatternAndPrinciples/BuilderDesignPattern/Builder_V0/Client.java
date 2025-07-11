package main.BuilderDesignPattern.Builder_V0;

public class Client {
    public static void main(String[] args) {
        //way 1: using long and multiple constructor
        //way 2: using setters
        //way 3: using HashMap
        //way 4: using another custom class to take input on behalf of original class
        //SoldItemBuilder soldItemBuilder = new SoldItemBuilder();
        SoldItemBuilder soldItemBuilder=SoldItem.getBuilder();
        soldItemBuilder.setId(1);
        soldItemBuilder.setName("Sold Item");
        soldItemBuilder.setPrice(100);
        soldItemBuilder.setQuantity(10);
        soldItemBuilder.setPrime(true);
        soldItemBuilder.setPaymentMethod("Payment Method");
        soldItemBuilder.setDiscount(0.2);

        SoldItem soldItem=new SoldItem(soldItemBuilder);
        System.out.println(soldItem.toString());

        //above code is not clean ,check version V1 for more clean code for the same thing
    }
}
