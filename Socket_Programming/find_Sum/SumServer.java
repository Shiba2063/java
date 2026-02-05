import java.net.*;
import java.io.*;
import java.util.*;

public class SumServer {

    public static void main(String arg[]) throws IOException {

        ServerSocket ss = new ServerSocket(1251);
        System.out.println("Server is running on port 1251...");

        Socket cs = ss.accept();
        System.out.println("Client connected.");

        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);

       
        outs.println("Enter First Number:");
        int a = Integer.parseInt(ins.nextLine());

        outs.println("Enter Second Number:");
        int b = Integer.parseInt(ins.nextLine());

        int result = a + b;

        outs.println("Sum = " + result);

        ins.close();
        outs.close();
        cs.close();
        ss.close();
    }
}
