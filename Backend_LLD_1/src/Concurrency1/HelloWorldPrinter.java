package Concurrency1;

public class HelloWorldPrinter implements Runnable{

    HelloWorldPrinter()  {


    }
    public void print(){
        System.out.println("Hello World "+Thread.currentThread().getName());

    }
    public void run(){
        print();
    }
}
