public class logby2 {



    public static int calcpower(int x,int n)
    {
        if(x==0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }

        if(n%2==0)
        {

        int ans=  calcpower(x,n/2)*calcpower(x,n/2);
        return ans; // ans variable scope is only for if 
        }
        else
        {
            int ans= calcpower(x,n/2)*calcpower(x,n/2)*x;
            return ans;

        }
    }
    public static void main(String[] args) {


        int x = 2;
        int n = 5;

         int a =calcpower(2,5);
         System.out.print(a);

        

    }
    
}
