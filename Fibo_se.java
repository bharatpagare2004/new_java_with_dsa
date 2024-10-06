
import java.util.*;
public class Fibo_se {


    public static void fib(int a,int b,int n)
    {
        if(n==0)
        {
            return;
        }
        int c= a+b;
        System.out.println(c);
        fib(b,c,n-1); // fuction call itselt


    }


    public static void main(String[] args) {
        
       int a = 0;
       int b = 1;
       Scanner sc = new Scanner(System.in);
       System.out.print("enter the term you want to enter :");
       int n = sc.nextInt();
       System.out.println(a);
       System.out.println(b);
       fib(a,b,n-2);



    }
    
}
