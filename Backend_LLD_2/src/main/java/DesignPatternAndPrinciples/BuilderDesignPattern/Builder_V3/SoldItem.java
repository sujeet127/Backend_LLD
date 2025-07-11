package main.DesignPatternAndPrinciples.BuilderDesignPattern.Builder_V3;

public class SoldItem {
    private int id;
    private String name;
    private int price;
    private int quantity;
    private boolean isPrime;
    private double discount;
    private String paymentMethod;
    //private double tax;  //new attributes can be added easily modifying code much
    private SoldItem(SoldItemBuilder soldItemBuilder) {
        //validation can be done over here also
        this.id=soldItemBuilder.getId();
        this.name=soldItemBuilder.getName();
        this.price=soldItemBuilder.getPrice();
        this.quantity=soldItemBuilder.getQuantity();
        this.isPrime=soldItemBuilder.isPrime();
        this.discount=soldItemBuilder.getDiscount();
        this.paymentMethod=soldItemBuilder.getPaymentMethod();
//        if(tax>100){
//            this.tax=100;
//        }

    }
    public static SoldItemBuilder getBuilder(){
        return new SoldItemBuilder();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public boolean isPrime() {
        return isPrime;
    }

    public void setPrime(boolean prime) {
        isPrime = prime;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return "SoldItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", isPrime=" + isPrime +
                ", discount=" + discount +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
 //inner class
    public static class SoldItemBuilder {
        private int id;
        private String name;
        private int price;
        private int quantity;
        private boolean isPrime;
        private double discount;
        private String paymentMethod;

        public SoldItem build(){
            return new SoldItem(this); //return the same calling object
        }

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

    }
}
