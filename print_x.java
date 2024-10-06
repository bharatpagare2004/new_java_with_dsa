public class print_x {




    public static int print_x_rest_n(int x,int n)
    {

        if(x==0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1; 
        }
          int xpowern1 = print_x_rest_n(x, n-1); // here recursion 
          int xpowern = x*xpowern1; // formula is x^n = (x)*(x^n-1);
          return xpowern;

    }
    public static void main(String args[])
    {
        int x = 2;
        int n = 3;
        int ans =print_x_rest_n(2, 3);
        System.out.print(ans); 

    }



    
}
