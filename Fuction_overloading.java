
class Student{

    int age ;
    String name ;

    Student(String name ,int age)
    {
        this.age = age;
        this.name = name;

    }
    public void printInfo(String name)
    {
        System.out.println(name);
    }

    public void printInfo(int age)
    {
        System.out.println(age);
    }

    public void printInfo(String name , int age ){

        System.out.println(name +"  "+age);
    }


}




public class Fuction_overloading {





    public static void main(String[] args) {

       

        Student s1 = new Student("bharat",22);

        s1.printInfo(22);

        s1.printInfo("bharat",22);
        s1.printInfo("bharat");
     
        





        
    }
    
}
