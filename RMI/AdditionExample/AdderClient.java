import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class AdderClient {

    public static void main(String[] args) throws RemoteException {
        AdderClient rc = new AdderClient();
        rc.connectRemote();
    }

    private void connectRemote() throws RemoteException {
        try {
            Scanner sc = new Scanner(System.in);

            Registry reg = LocateRegistry.getRegistry("localhost", 9999);
            Adder ad = (Adder) reg.lookup("hi server");

            System.out.println("Enter two numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println("Addition is: " + ad.add(a, b));

        } catch (RemoteException | NotBoundException e) {
            System.out.println("Exception: " + e);
        }
    }
}
