package Inventory_Management_system;

public class DuplicateItemException extends RuntimeException{
    public DuplicateItemException() {
        super("Duplicate Item found");
    }
    public DuplicateItemException(String message) {
        super(message);
    }
}
