class Pen{
    String color;
    String type;// gel ,ball


    public void  write()
    {
        System.out.println("something writing");
    }
    public void info()
    {
        System.out.println(this.color); // current class object
        System.out.println(this.type);

    }

}

class Student
{
    int age;
    String name ;

    // constructor object initialization

    // property 
    // same name of class
    // not return  anything
    // one object for one constuctor

    // Student() // initialization of object
    // {
    //     this.name = "bharat";
    //     this.age = 34;
    //     System.out.println("this is constructor");

    // }


    // parametrized constructor

    Student(int age , String name)
    {

        this.age = age;
        this .name = name;



    }
    public void info()
    {
        System.out.println(this .name);
        System.out.println(this.age);
    }


}


public class OOP {


    public static void main(String args[])
    {
        Pen p1 = new Pen(); // type classname p1 is object

        // p1.color = "black";
        // p1.type = "gel";

        // // second object

        // Pen p2 = new Pen();

        // p2.color = "blue";
        // p2.type = "ballpoint";


        // // p1.write();
        // // p1.info();

        // p2.write();
        // p2.info();

        int age = 21;
        String name = "bharat";

        Student s1 = new Student( age,  name); // inside memory heap object store 
       

        s1.info();
    }
    
}
