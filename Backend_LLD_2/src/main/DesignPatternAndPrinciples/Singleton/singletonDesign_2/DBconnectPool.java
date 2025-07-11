package main.Singleton.singletonDesign_2;

public class DBconnectPool {
    private static DBconnectPool instance=null;
    private DBconnectPool(){
    }

    public static DBconnectPool getConnection(){
        //multiple thread can entire if part
        if(instance == null){
            instance = new DBconnectPool();
            System.out.println("new Connections: "+Thread.currentThread().getName());
        }
        System.out.println("old Connections: "+Thread.currentThread().getName());
        return instance;
    }

}
