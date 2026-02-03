
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
public class ProductClient {
    public static void main(String args[])throws RemoteException
    {
       ProductClient rc=new ProductClient();
        rc.connectRemote();
    }
    private void connectRemote()throws RemoteException
    {
        try{
           Scanner sc=new Scanner(System.in);
           Registry reg=LocateRegistry.getRegistry("localhost",9990);
           Product ad=(Product)reg.lookup("hi server");
           System.out.println("Enter a first  number:");
           int n1=sc.nextInt();
           System.out.println("Enter a second  number:");
           int n2=sc.nextInt();
           System.out.println("Factorial is" +ad.product(n1,n2));
           
        }
        catch(RemoteException | NotBoundException e){
            System.out.println("Exception"+e);
            
        }
            
    }
    
}