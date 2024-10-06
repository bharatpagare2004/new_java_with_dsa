public class Factorial_of_num {



    public static void Fact(int n)
    {
    
        int fact =1;
        for(int i = n;i>=1;i--)
        {
            
        
             fact = i*fact;
            
        }
        System.out.print("The factorial of "+ n +"number is :"+fact);

    }

    public static void main(String args[])

    {
        int n = 4;
        Fact(n);


    }
    
}
