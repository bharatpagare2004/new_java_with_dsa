public class TotalPath {



    public static int countPath(int i ,int j , int m , int n)
    {


        if(i == n || j == m)
        {
            return 0;
        }

        if(i == n -1 && j == m-1)
       {  
        return 1;
       }
       // downword moves

        int downword = countPath(i+1, j, m, n);
        // upward moves
        int sidemoves = countPath(i, j+1, m, n);

        return downword+sidemoves;

    }


    public static void main(String args[])
    {

     int n = 3;
     int m = 3;

     int totalPath = countPath(0, 0, n, m);
     System.out.println(totalPath);
    }
    
}
