
class Student
{

    int age;
    String name;
    Student(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    public void printInfo()
    {
        System.out.println(age);

        System.out.println(name);

    }
}


public class Parameter_constructor {


    public static void main(String aggs[])
    {
        Student s1= new Student(23,"bharat");

        s1.printInfo();
    }
    
}
