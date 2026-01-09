import java.util.Scanner;
public class Alphabet {

  
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Alphabet:");
        char al=sc.next().charAt(0);
        switch(al)
        {
            case 'a':
                System.out.println("This is vowel letter.");
                break;
            case 'e':
                System.out.println("This is vowel letter.");
                break;
            case 'i':
                System.out.println("This is vowel letter.");
                break;    
             case 'o':
                System.out.println("This is vowel letter.");
                break;
             case 'u':
                System.out.println("This is vowel letter.");
                break; 
             default:
                 System.out.println("This is consonant");
        }
    }
    
}
