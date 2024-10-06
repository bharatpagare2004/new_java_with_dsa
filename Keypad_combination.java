public class Keypad_combination {



    public static String[] keypad = {".","abc", "def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    public static void printCombo(String str,int index,String combinationstr){

        if(index  == str.length())
        {


            System.out.println(combinationstr);
            return;
        }



        char currentchar = str.charAt(index);
        String mapping = keypad[currentchar-'0'];


        for(int i = 0;i<mapping.length();i++)
        {

            printCombo(str, index+1, combinationstr+mapping.charAt(i));

        }



    }


    
    public static void main(String[] args) {

        String str = "23";
        printCombo(str, 0, "");

        
    }
    
}
