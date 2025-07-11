package main.Singleton.singletonDesign_4;

public class DBconnectPool {
    //eager initiation
    //will increase application start time
    //will not able to do custom configuration
    private static DBconnectPool instance=new DBconnectPool();
    // Private constructor
    private DBconnectPool() {
        System.out.println("Creating instance: "+ Thread.currentThread().getName());
    }

    public static DBconnectPool getConnection(){
        //System.out.println("Instance: "+instance);
        return instance;
    }


}
