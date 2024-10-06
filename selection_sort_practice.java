public class selection_sort_practice {


    public static void main(String args[])
    {
        int arr[] = {45,6566,3333,55,0,565,98888,12}; // array initialization

        for(int i = 0;i<arr.length-1;i++)
        {
            int smallest = i;

            for(int j = 1+i;j<arr.length;j++)
            {
                if(arr[smallest]>arr[j])
                {
                    smallest = j;
                }
            }
            int temp = arr[i];
            arr[i] =arr[smallest];
            arr[smallest] = temp;
        }
        System.out.print("the sorted element is :");
        for(int k = 0;k<arr.length;k++)
        {
            System.out.print(arr[k]+" ");
        }
    }

    
}
