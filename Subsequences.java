
import java.util.HashSet;
public class Subsequences {



    public static void subseq(String str ,int index ,String nstr,HashSet<String> set)
    {
        if(index == str.length())
        {
            if(set.contains(nstr))
            {
                return;
            }
            else
            {
                System.out.println(nstr);
                set.add(nstr);
                return ;
            }
        }
        char currentchar = str.charAt(index);
        subseq(str, index+1, nstr+currentchar ,set);
        subseq(str, index+1, nstr,set);



    }
    public static void main(String[] args) {


        String str = "abc";

        HashSet<String> set = new HashSet<>();

        subseq(str, 0, "" ,set);
   
        
    }
    
}
