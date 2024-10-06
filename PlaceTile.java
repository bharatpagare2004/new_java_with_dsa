public class PlaceTile {
    public static int placeTile(int n , int m)
    {


        if(n ==m)
        {
            return 2;
        }

        if(n<m)
        {
            return 1;
        } 
      //vertically

        int vertically = placeTile(n-m, m);
         // horizontally 
         int horizontally = placeTile(n-1, m);

         return horizontally+vertically;

    }
    public static void main(String args[])
    {


        int n = 4;
         int m = 2;

         placeTile(n, m);
         System.out.println(placeTile(n, m));
    }
    
}
