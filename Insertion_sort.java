import java.util.*;
public class Insertion_sort {


    public static void main(String args[])
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the size of array");
        int sizeofarray = sc.nextInt();

        int arr[] = new int[sizeofarray];
        for(int i = 0;i<sizeofarray;i++)
        {
            arr[i] = sc.nextInt();
        }
        // insertion sort
        for(int i = 1;i<arr.length;i++)
        {
            int temp = arr[i];
            int j = i-1;

            while(j>=0&& arr[j]>temp)
            {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = temp;
        }

        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }




        }
    }
    

