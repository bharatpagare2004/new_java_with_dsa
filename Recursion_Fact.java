public class Recursion_Fact {

    public static int fact(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        int fact_n_1= fact(n-1);
        int fact = n*fact_n_1;
        return fact; 
    }


    public static void main(String args[])
    {
        int n =4
        ;
        int fact = fact(n);
        System.out.print("the factorial of given number is :"+fact);
    }
    
}
