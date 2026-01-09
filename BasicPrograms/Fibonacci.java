import java.util.Scanner;
public class Fibonacci {
    public static void main(String args[])
    {
        
    Scanner sc=new Scanner(System.in);
       int a,b=0,c=1,i;
       System.out.print("Enter a number of terms:");
       int num=sc.nextInt();
       for(i=0;i<num;i++)
       {
           System.out.print(b+" ");
           a=b;
           b=c;
           c=a+b;
       }
    }   
       
    
}
