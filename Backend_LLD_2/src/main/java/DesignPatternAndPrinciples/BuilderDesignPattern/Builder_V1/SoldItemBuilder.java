package main.DesignPatternAndPrinciples.BuilderDesignPattern.Builder_V1;

public class SoldItemBuilder {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private boolean isPrime;
    private double discount;
    private String paymentMethod;

    public SoldItemBuilder setId(int id) {
        this.id = id;
        return this;
    }

    public SoldItemBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public SoldItemBuilder setPrice(int price) {
        this.price = price;
        return this;
    }

    public SoldItemBuilder setQuantity(int quantity) {
        this.quantity = quantity;
        return this;
    }

    public SoldItemBuilder setPrime(boolean prime) {
        isPrime = prime;
        return this;
    }

    public SoldItemBuilder setDiscount(double discount) {
        this.discount = discount;
        return this;
    }

    public SoldItemBuilder setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public double getDiscount() {
        return discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {
        return "SoldItemBuilder{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isPrime=" + isPrime +
                ", discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
}
