import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
public class ProductServer extends UnicastRemoteObject implements Product{
    public ProductServer()throws RemoteException{
        super();
    }
    public int product(int n1,int n2)throws RemoteException
    {
        return n1*n2;
    }
    public static void main(String args[]){
        try{
            Registry reg=LocateRegistry.createRegistry(9990);
            reg.rebind("hi server",new ProductServer());
            System.out.println("Server is ready");
        }
        catch(RemoteException e){
            System.out.println("Exception:"+e);
        }
    }
        
    
    
}