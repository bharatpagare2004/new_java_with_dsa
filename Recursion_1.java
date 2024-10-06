public class Recursion_1 {



   public static void move_all_x(String str , int index , int count , String newstring){


   if(index == str.length()) // in short it is base condition
   {
    for( int i  = 1;i<=count;i++)
    {
        // inside this for loop we add our x
        newstring = newstring + 'x';
        
    }
    System.out.println(newstring);
    return; // here we return all the string
   }
   
    char currentChar = str.charAt(index); // here we find the current character

    if(currentChar == 'x')
    {
        count ++;
        move_all_x(str, index+1, count, newstring);
    }
    else
    {
        newstring = newstring+currentChar;
        move_all_x(str, index+1, count, newstring);
    }
   }
   

    public static void main(String[] args) {
      
        String str = "axbcxxd";
        move_all_x(str, 0, 0, "");

        
    }
    
}
