import rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface Factorial_Find extends Remote {
    int factorial(int n)throws RemoteException;
    
}
