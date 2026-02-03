import rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Product extends Remote {
    int product(int n1,int n2)throws RemoteException;
    
}