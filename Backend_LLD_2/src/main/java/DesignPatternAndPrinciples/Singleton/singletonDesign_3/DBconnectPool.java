package main.DesignPatternAndPrinciples.Singleton.singletonDesign_3;

public class DBconnectPool {
    private static DBconnectPool instance=null;
    private DBconnectPool(){
    }
   //performance compromised here
    synchronized static DBconnectPool getConnection(){
        //only one thread can entire this method at a time
        if(instance == null){
            instance = new DBconnectPool();
            System.out.println("Connections"+Thread.currentThread().getName());
        }
        //System.out.println("instance:"+instance);
        System.out.println("instance:"+instance+" "+Thread.currentThread().getName());
        return instance;
    }

}
