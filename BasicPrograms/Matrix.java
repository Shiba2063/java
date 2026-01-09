import java.util.Scanner;
public class Matrix {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int mat1[][]=new int[3][3],mat2[][]=new int[3][3],matsum[][]=new int[3][3];
        System.out.println("Enter a first matrix element: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 mat1[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        System.out.println("Enter a second matrix element: ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                 mat2[i][j]=sc.nextInt();
            }
            System.out.println();
        }
        
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                matsum[i][j]=mat1[i][j]+mat2[i][j];
            }
            System.out.println();
        }
        System.out.println("First Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.out.print(mat1[i][j]+i);
            }
            System.out.println();
        }
        System.out.println("Second Matrix:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.out.print(mat2[i][j]+i);
            }
            System.out.println();
        }
        System.out.println("sum of these two Matrix is:");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
               System.out.print(matsum[i][j]+i);
            }
            System.out.println();
        }
        
    }
}
