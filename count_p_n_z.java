
import java.util.*;

public class count_p_n_z {


    public static void main(String[] args) {
        
        int p =0;
        int n =0;
        int z = 0;

        
        System.out.println("Press 1 to continue and 0 for stop");

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        while(input==1)
        {

            System.out.println("enter your number:");
            int num = sc.nextInt();

            if(num>0)
            {
                p++;
            }
            else if(num<0)
            {
                n++;
            }
            else
            {
                z++;
            }
            System.out.println("Press 1 to continue and 0 for stop");
            int input1 = sc.nextInt();

            System.out.println(p);
            System.out.println(n);
            System.out.println(z);




        }
    }




    
}
