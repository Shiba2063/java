import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class AdderServer extends UnicastRemoteObject implements Adder {

    public AdderServer() throws RemoteException {
        super();
    }

    @Override
    public int add(int n1, int n2) throws RemoteException {
        int sum = n1 + n2;

        if (n1 % 2 == 0 && n2 % 2 == 0) {
            return sum * sum;        // (a + b)^2
        } else {
            return sum * sum * sum;  // (a + b)^3
        }
    }

    public static void main(String[] args) {
        try {
            Registry reg = LocateRegistry.createRegistry(9999);
            reg.rebind("hi server", new AdderServer());
            System.out.println("Server is ready");
        } catch (RemoteException e) {
            System.out.println("Exception: " + e);
        }
    }
}
