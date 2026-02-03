
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.*;
public class FactorialClient {
    public static void main(String args[])throws RemoteException
    {
       FactorialClient rc=new FactorialClient();
        rc.connectRemote();
    }
    private void connectRemote()throws RemoteException
    {
        try{
           Scanner sc=new Scanner(System.in);
           Registry reg=LocateRegistry.getRegistry("localhost",9999);
           Factorial_Find ad=(Factorial_Find)reg.lookup("hi server");
           System.out.println("Enter a number:");
           int n=sc.nextInt();
           System.out.println("Factorial is"+ad.factorial(n));
           
        }
        catch(RemoteException | NotBoundException e){
            System.out.println("Exception"+e);
            
        }
            
    }
    
}
