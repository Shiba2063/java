
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class Factorialserver extends UnicastRemoteObject implements Factorial_Find{
    public Factorialserver()throws RemoteException{
        super();
    }
    public int factorial(int n)throws RemoteException
    {
        int fact=1;
        for(int i=n;i>=1;i--){
            fact*=i;
        }
        return fact;
    }
    public static void main(String args[]){
        try{
            Registry reg=LocateRegistry.createRegistry(9999);
            reg.rebind("hi server",new Factorialserver());
            System.out.println("Server is ready");
        }
        catch(RemoteException e){
            System.out.println("Exception:"+e);
        }
    }
        
    
    
}
