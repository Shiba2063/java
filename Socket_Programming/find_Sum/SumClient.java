import java.net.*;
import java.io.*;
import java.util.*;

public class SumClient {
    public static void main(String arg[]) throws IOException {

        Socket cs = new Socket("localhost", 1251);

        Scanner ins = new Scanner(cs.getInputStream());
        PrintWriter outs = new PrintWriter(cs.getOutputStream(), true);
        Scanner sc = new Scanner(System.in);

      
        System.out.println(ins.nextLine()); 
        int a = sc.nextInt();
        outs.println(a);

        
        System.out.println(ins.nextLine());
        int b = sc.nextInt();
        outs.println(b);

        
        System.out.println(ins.nextLine());

        ins.close();
        outs.close();
        cs.close();
        sc.close();
    }
}
