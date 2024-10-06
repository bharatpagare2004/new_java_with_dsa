public class isSorted {




    public static boolean isSorted(int arr[],int index)
    {
        // base case is 

        if(index == arr.length-1)
        {
            return true;
        }

        if(arr[index] >= arr[index+1])
        {
            return false ;
            
        }
        

        return isSorted(arr, index+1);
    }
    public static void main(String[] args) {
        
       int arr[] = {1,2,3,44};
       System.out.println(isSorted(arr, 0));

    }
    
}
