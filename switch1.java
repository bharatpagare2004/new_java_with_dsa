
import java.util.*;

public class switch1 {

   public static void main(String agrs[])
   {
    Scanner sc = new Scanner(System.in);
    System.out.print("enter the button:");
    int button = sc.nextInt();

   //  if(button == 1)
   //  {
   //    System.out.println("tv on");
   //  }
   //  else if(button == 2)
   //  {
   //    System.out.println("ac on");
   //  }
   //  else if(button == 3)
   //  {
   //    System.out.println("cooler on");
   //  }
   //  else
   //  {
   //    System.out.println("invalid button");
   //  }
   switch(button)
   {
      case 1:System.out.println("tv on");
       break;
      case 2:System.out.println("cooler on ");
      break;
      case 3:System.out.println("bulb on");
      break;
      case 4:System.out.println("machine on ");
      default:System.out.println("invalide button");
   }
   }
}
