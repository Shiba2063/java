import java.util.Scanner;
public class checkPrime {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number you want to check prime or not:");
        int num=sc.nextInt();
        for(int i=2;i<num;i++)
        {if(num%i==0)
            {
                System.out.println("The given number is not prime");
                break;
            }
        
        else
            {
                System.out.println("The given number is prime");
                break;
            }    
        }
    }
        
    
}
