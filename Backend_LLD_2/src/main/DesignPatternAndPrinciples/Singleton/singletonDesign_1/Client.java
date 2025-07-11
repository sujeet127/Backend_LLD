package main.Singleton.singletonDesign_1;

public class Client {
    public static void main(String[] args) {
        DBconnectPool db1 = new DBconnectPool();
        DBconnectPool db2 = new DBconnectPool();
        DBconnectPool db3 = new DBconnectPool();

        //1. user can create multiple object,no restriction at all here


    }
}
