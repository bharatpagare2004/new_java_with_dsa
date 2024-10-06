import java.util.Scanner;

public class Even {


    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    System.out.print("enter the number:");
    int num = sc.nextInt();

    if(num%2==0)
    {
        System.out.println("the num is even");
    }
    else{
        System.out.println("the num is not even");
    }
    }
    
}
