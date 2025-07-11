package Concurrency1;

public class NumberPrinter implements Runnable {
    private int number;
    public NumberPrinter(int number){
        this.number = number;
    }
    @Override
    public void run() {
        System.out.println("Printing number: " + number+" "+Thread.currentThread().getName());
    }
}
