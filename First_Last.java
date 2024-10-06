
class First_Last
{

    public static int first = -1;
    public static int last = -1;

    public static void firstLastOccurence(String str , int index , char element)
    {
        if(index == str.length())
        {
            System.out.println(first);
            System.out.println(last);
            return ;
        }

        char currentchar = str.charAt(index);
        if(currentchar == element)
        {
            if(first == -1)
            
    {
    first = index;
    }
    else{
    last = index;
    }
        }
        firstLastOccurence(str, index+1, element);
    }
    public static void main(String[] args) {

     
        String  str ="madam" ; //01234 m at 0 and 4
        firstLastOccurence(str, 0, 'm');
        



    }
}