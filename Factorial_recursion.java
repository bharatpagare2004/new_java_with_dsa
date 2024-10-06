public class Factorial_recursion {


    public static double factorial_Num(double n)
    {
        if(n==1||n==0)
        {
            return 1;
        }

        double fact_nm1=factorial_Num(n-1);
        double fact = n*fact_nm1;
        return fact;
        

    }

    public static void main(String[] args) {
        
     double n =factorial_Num(50);
     System.out.print("the factorial of given number is:"+n);
     
    }
    
}    
