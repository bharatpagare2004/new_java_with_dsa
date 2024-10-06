public class recusion {



    public static void printNum(int n )
    {
        if(n==0)
        {
            return;
        }
        // simple print statement
        System.out.println(n);
        printNum(n-1); // recusion // function call itself

    }
    public static void main(String[] args) {
        

        int n = 5;
        printNum(n);

    }
    
}
