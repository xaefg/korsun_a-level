package hw12;

import java.rmi.RemoteException;


public class Task3 {
    static Exception e = new RuntimeException();
    static Exception d = new RemoteException();
    static Exception c = new Exception();

    public static void main(String[] args) {
        try{
            e.printStackTrace();
            d.printStackTrace();
            c.printStackTrace();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
