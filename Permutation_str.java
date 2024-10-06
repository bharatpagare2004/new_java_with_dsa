public class Permutation_str {




    public static void permutation(String str , String permutaionstr)
    {
        if(str.length() == 0)
        {
            System.out.println(permutaionstr);
            return;
        }
        for(int i = 0;i<str.length();i++)
        {
            char currentchar = str.charAt(i);
            // abc ==>bc
            String newstr = str.substring(0, i)+str.substring(i+1);
            permutation(newstr, permutaionstr+currentchar);
        }
    }
    public static void main(String[] args) {

        String str = "abc";
        permutation(str, "");
        
    }
    
}
