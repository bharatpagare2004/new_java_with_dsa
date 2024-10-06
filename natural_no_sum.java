import java.util.Scanner;

public class natural_no_sum {

public static void main(String[] args) {
    

Scanner sc = new Scanner(System.in);
    System.out.print("enter the natural number you want to find sum of it:");
    int num = sc.nextInt();
    int sum =0;

    for( int i  = 1;i<=num;i++)
    {
        
        sum= sum +i;
    }
    System.out.println(sum);
    
}
}