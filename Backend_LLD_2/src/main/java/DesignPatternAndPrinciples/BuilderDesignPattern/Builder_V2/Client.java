package main.DesignPatternAndPrinciples.BuilderDesignPattern.Builder_V2;

public class Client {
    public static void main(String[] args) {
        //way 1: using long and multiple constructor
        //way 2: using setters
        //way 3: using HashMap
        //way 4: using another custom class to take input on behalf of original class
        //SoldItemBuilder soldItemBuilder = new SoldItemBuilder();

        //best example of abstraction
        SoldItem soldItem=
                SoldItem
                        .getBuilder()
                        .setId(1)
                        .setQuantity(15)
                        .setPrice(200)
                        .setDiscount(0.25)
                        .setName("Sold Item1")
                        .setPaymentMethod("GPay")
                        .setPrime(true)
                                .build();

        System.out.println(soldItem.toString());

        //if you want to enforce everyone to go though builder way only ,
        // instead of creating object of Solditem , then check version V3

    }
}
