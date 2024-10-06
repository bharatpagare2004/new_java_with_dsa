public class xrestton {



    public static int xrestton1(int x, int n)
    {
        // base case
        if(x==0)
        {
            return 0;
        }
        if(n == 0)
        {
            return 1;
        }
        int xresttomn = xrestton1(x , n-1);
        int xrestton = x*xresttomn;
        return xrestton;
    }
    public static void main(String[] args) {

        int ans = xrestton1(2,3);
        System.out.print(ans);
        
        
    }
    
}
