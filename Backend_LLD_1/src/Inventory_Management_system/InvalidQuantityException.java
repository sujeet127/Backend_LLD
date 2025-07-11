package Inventory_Management_system;

public class InvalidQuantityException extends Exception {
    public InvalidQuantityException(String message) {
        super(message);
    }
    public InvalidQuantityException() {
        super("Invalid Quantity");
    }

}
