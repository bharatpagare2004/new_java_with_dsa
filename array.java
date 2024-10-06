

import java.util.*;
public class array {


    public static void main(String args[])
    {

        int size= 5;
        Scanner sc = new Scanner(System.in);
        int marks[] = new int[size];
        // input

        for(int i = 0;i<size;i++)
        {
            marks[i] = sc.nextInt();
        }

        System.out.print("enter the number you want to find:");

        int x = sc.nextInt();

       

        for(int i = 0;i<size;i++)
        {
           if(x==marks[i])
           {
            System.out.println("the number is fount at the location "+i);
           }
        }
        



    }
    
}
