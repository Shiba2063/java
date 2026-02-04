
import java.net.*;
import java.io.*;
import java.util.*;
public class FactorialClient{
    public static void main(String args[]) throws IOException{
        Socket cs=new Socket("localhost",1251);
        Scanner ins=new Scanner(cs.getInputStream());
        PrintWriter  outs = new PrintWriter(cs.getOutputStream(),true);
        Scanner sc=new Scanner(System.in);
        System.out.println(ins.nextLine());
        int num=sc.nextInt();
        outs.println(num);
        System.out.println(ins.nextLine());
        ins.close();
        outs.close();
        cs.close();
        sc.close();
    }
}