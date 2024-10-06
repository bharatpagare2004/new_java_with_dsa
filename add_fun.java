import java.util.Scanner;

public class add_fun {


    public static int mulTwo(int a,int b)
    {
        int mul ;
        //mul = a*b;
        return mul = a*b;
    }


    

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.print("enter the number:");
    int num1= sc.nextInt();
    int num2= sc.nextInt();

   //  int u = mulTwo(num1, num2);
    System.out.println("sum of two no is :"+mulTwo(num1,num2));

    


    }
}
