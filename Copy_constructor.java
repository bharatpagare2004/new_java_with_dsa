



class Student{

    int age;
    String name;


    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }

    Student(Student s2)
    {
        this.name = s2.name;
        this.age = s2.age;
    }
    

    Student()
    {
        System.out.println("this non para constructor");
    }
}

class Copy_constructor
{


    public static void main(String args[])
    {

        Student s1 = new Student();

        s1.name = "bharat";
        s1.age = 34;

        Student s2 = new Student(s1);

        s2.printInfo();


        

    }
}