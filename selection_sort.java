import java.util.Scanner;

public class selection_sort {

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

        // selection sort
        for(int i = 0;i<arr.length-1;i++)
        {    
            int smallest = i;
            for(int j = i+1;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest =j;
                }

                
            }
            int temp = arr[i];
                arr[i] = arr[smallest];
                arr[smallest] = temp;
            
        }
        System.out.print("sorted element is :");
        for(int i = 0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }

    }
    
}
