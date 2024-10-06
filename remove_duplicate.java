public class remove_duplicate {




    public static boolean map[] = new boolean[26];

    public static void remove_duplicate1(String str , int index , String newstr)
    {
        if(index == str.length())
        {
            System.out.println(newstr);
            return;
        }
        char currentchar = str.charAt(index);
        if(map[currentchar-'a'] == true)
        {
            remove_duplicate1(str, index+1, newstr);
        }
        else
        {
            newstr = newstr+currentchar;

            map[currentchar-'a'] = true;
            remove_duplicate1(str, index+1, newstr);
        }

    }
    public static void main(String[] args) {


        String str = "abcdddbpqr"; // abcdpqr
        remove_duplicate1(str, 0, "");
        

    }
    
}
