import java.util.Scanner;

public class table {



    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.print("enter the number:");
    int num = sc.nextInt();

    int table = 1;

    for(int i = 1;i<=10;i++)
    {
        table = num*i;
        System.out.println(table=num*i);
    }



    }
    
}
