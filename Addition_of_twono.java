class Addition
{
    int a;
    int b;

    Addition(int a,int b)
    {
        this.a= a;
        this.b = b;
    }

    public void add()
    {
        int c = a+b;
        System.out.print(c);

    }
}



public class Addition_of_twono {





    public static void main(String args[])
    {
        Addition a1 = new Addition(10, 20);

        a1.add();

    }
    
}
