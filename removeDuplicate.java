public class removeDuplicate {





    public static boolean map[] = new boolean[26];

    public static void removeDuplicate(String str, int index,String newstring)
    {
        if(index == str.length())
        {
            System.out.println(newstring);
            return;
        }

        char currentchar = str.charAt(index);

        if(map[currentchar -'a'] == true)
      {
        removeDuplicate(str, index+1, newstring);
      }
      else
      {
        newstring = newstring + currentchar;

        map[currentchar - 'a'] = true;
        removeDuplicate(str, index+1, newstring);
      }
    }
    public static void main(String[] args) {


        String str = "abbcd";
        removeDuplicate(str, 0,"");
        
    }
    
}
