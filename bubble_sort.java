public class bubble_sort {


    public static void printarrray(int array[])
    {
        for(int i=0;i<array.length;i++)
        {
            System.out.print(array[i]+" ");
        }
    }

    


    public static void main(String[] args) {
        
    
    int array[] ={37,8,3,81,2};
    //bubble sort

    //time complexity =O(n^2)--- 

    // write outer loop 
    for(int i = 0;i<array.length-1;i++)
    {
        for(int j = 0 ;j<array.length-1;j++)
        
        {
            if(array[j] >array[j+1])
            {
                // here perform swapping

                int temp = array[j];
                array[j] = array[j+1];
                array[j+1] = temp;

            }
        }

       
    }
    printarrray(array);
   
}
}
