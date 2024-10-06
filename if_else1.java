import java.util.Scanner;

public class if_else1 {


 public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);
    System.out.print("enter the value a and b:");
    int a = sc.nextInt();
    int b = sc.nextInt();

    if(a==b)
    {
        System.out.println("a and b is equal");
    }
    // else{
    //     if(a>b)
    //     {
    //         System.out.println("a is greater");

    //     }
    //     else
    //     {
    //         System.out.println("b is greater");

    //     }
    //}
    else if(a>b)
    {
        System.out.println(" a is greater");
    }
    else
    {
        System.out.println("b is greater");
    }
    
 }
     
    
}
