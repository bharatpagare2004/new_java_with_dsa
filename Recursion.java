public class Recursion {

    public static void reverseOfString(String str,int index)
    {
        if(index==0)
        {
            System.out.println(str.charAt(index));
            return;
        }
        System.out.print (str.charAt(index));
        reverseOfString(str, index-1);
    }

    public static void main(String[] args) {

        String str = "abcd";
        reverseOfString(str, str.length()-1);
        
    }
    
}
