
import java.util.*;

public class Bubble_sort_p {


    // public static void printarr(int arr[])
    // {
    //     System.out.print("the sorted array is :");
    //     for(int i =0;i<arr.length;i++)
    //     {
    //         System.out.print(arr[i]+" ");
    //     }
    // }



    public static void main(String args[])
    {

    

        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of element you want to enter for bubble sort:");
        int size = sc.nextInt();
        int arr[] = new int[size];

        // input array element
        for(int i =0;i<size;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("your entered element is :");
        for(int i = 0 ;i<size;i++)
        {
            System.out.print(arr[i]+ " ");
        }

        // bubble sort
        for(int i= 0;i<arr.length-1;i++)
        {
            for(int j = 0;j<arr.length-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    
                    int temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print("the sorted array is :");
        for(int j =0;j<arr.length;j++)
        {
            System.out.print(arr[j]+" ");
        }

       //printarr(arr);

    }
    
}
