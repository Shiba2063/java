
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
public class checkClient {
    public static void main(String args[])throws RemoteException
    {
       checkClient rc=new checkClient();
        rc.connectRemote();
    }
    private void connectRemote()throws RemoteException
    {
        try{
           Scanner sc=new Scanner(System.in);
           Registry reg=LocateRegistry.getRegistry("localhost",9992);
           checkNumber ad=(checkNumber)reg.lookup("hi server");
           System.out.println("Enter a number:");
           int n=sc.nextInt();
           if(ad.check(n)==1){
               System.out.println("Number is even.");
           }
           else{
              System.out.println("Number is odd."); 
           }
        }
        catch(RemoteException | NotBoundException e){
            System.out.println("Exception"+e);
            
        }
            
    }
    
}