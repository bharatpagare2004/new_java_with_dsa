public class fact_with_rec {




    public static int fact_n(int n)
    {
        if(n==0 || n == 1)
        {
            return 1;
        }
        int fact_n_minus_1 = fact_n(n-1);
        int fact = n*fact_n_minus_1;

        return fact;

    }
    public static void main(String[] args) {
        
        int n = 4;

        int ans = fact_n(n);
        System.out.print(ans);
    }
    
}
