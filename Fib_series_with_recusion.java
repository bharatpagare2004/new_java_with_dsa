public class Fib_series_with_recusion {

    public static int fibrec(int a,int b , int n)
    {
        if(n==0)
        {
            return 0;
        }
        int c= a+b;
        System.out.println(c);
        int ans = fibrec(b,c, n-1);

        return ans;


    }
    public static void main(String args[])
    {
        int a = 0;
        int b = 1;
        int n = 6;
        System.out.println(a);
        System.out.println(b);
        int ans = fibrec(a,b,n-2);
        System.out.print(ans);

    }
    
}
