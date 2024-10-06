public class recursion_1_to_5 {




    public static void printNum(int n )
    {
        if(n==6)
        {
           return;
        }
        System.out.println(n);
        printNum(n+1);
    }
    public static void main(String args[] )
    {
        // print 1 to 5;

        int n = 1;
        printNum(n);
    }
    
}
