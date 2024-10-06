
import java.util.*;
public class twoArray
{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the rows and column");

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        //array declaration

        int matrix[][] = new int[rows][cols];

        // for input
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
                matrix[i][j] = sc.nextInt();
            }
        }

        System.out.print("enter the number you want to find:");

        int x = sc.nextInt();

        // for output
        for(int i = 0;i<rows;i++)
        {
            for(int j = 0;j<cols;j++)
            {
            //    System.out.print(matrix[i][j]+" ");

             if(matrix[i][j]==x)
             {
                System.out.println("the number location is :"+i+" "+j);
             }
            }
           System.out.println();
        }



        
    }

}