public class Sum_of_natural_no {



    public static void sum_n_natural_no1(int i , int n,int sum)
    {
        //this statement calculate sum

        if(i==n)
        {
            sum = sum+i;
            System.out.println(sum);
            return;
        }
        sum = sum +i;
        sum_n_natural_no1(i+1, n, sum); // recursion

    }

    public static void main(String args[])
    {
             sum_n_natural_no1(1, 5, 0);     
    }
    
}
