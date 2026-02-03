
import java.rmi.Remote;
import java.rmi.RemoteException;
public interface checkNumber extends Remote {
    int check(int n)throws RemoteException;
    
}