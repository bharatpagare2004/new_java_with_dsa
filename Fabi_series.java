public class Fabi_series {




    public static void printFib(int a,int b ,int n )
    {
        // n is number of term
        if(n==0)
        {
            return;
        }
        int c = a+b;
        System.out.println(c);
        printFib(b,c,n-1);
    } 
    public static void main(String[] args) {
        int a =0;
        int b =1;
        int n =5; // here n represent upto calculation....
        System.out.println(a);
        System.out.println(b);
        printFib(a,b,n-2);
    }
    
}
