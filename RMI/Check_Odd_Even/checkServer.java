import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class checkServer extends UnicastRemoteObject implements checkNumber{
    public checkServer()throws RemoteException
    {
        super();
        
    }
    @Override
    public int check(int n) throws RemoteException
    {
        if(n%2==0){
            return 1;
        }
        else{
            return 0;
        }
     }
    public static void main(String args[]){
        try{
            Registry reg=LocateRegistry.createRegistry(9992);
            reg.rebind("hi server",new checkServer());
            System.out.println("Server is ready");
        }
        catch(RemoteException e){
            System.out.println("Exception:"+e);
        }
    }
    }
        
    
   