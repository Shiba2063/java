import java.net.*;
import java.io.*;
import java.util.*;
public class FactorialServer {
    public static void main(String args[])throws IOException{
        ServerSocket ss= new ServerSocket(1251);
        System.out.println("server is running on port 1251.......");
        Socket cs=ss.accept();
        System.out.println("client connected");
        Scanner ins=new Scanner(cs.getInputStream());
        PrintWriter  outs = new PrintWriter(cs.getOutputStream(),true);
        outs.println("Enter a Number:");
        int num=Integer.parseInt(ins.nextLine());
        int fact=1;
        for(int i=num;i>=1;i--){
            fact*=i;
        }
        outs.println("Factorial:"+fact);
        ins.close();
        outs.close();
        cs.close();
        ss.close();
        
    }
}
