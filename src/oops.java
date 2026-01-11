public class oops {
    public static void main(String[] args){
        Pen p1 = new Pen();
        p1.setColor("Blue");
        p1.setTip(10);
        System.out.println(p1.tip);
        System.out.println(p1.color);
        Student s1 = new Student();
        s1.setAge(19);
        s1.setName("Akshit Tiwari");
        s1.CalcPercentange(90,95,97);
        System.out.println(s1.percentage);
        System.out.println(s1.age);
        System.out.println(s1.Name);
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Akshittiwari";

        // using constructor
        Students s2 = new Students();
        s2.name = "Akshit";
        s2.roll=19;
        s2.password = "abcd";
        Students s3 =  new Students(s2);
        s3.password = "xyz";
        Fish shark = new Fish();
        shark.swims();
        s2.marks[0] =100;
        s2.marks[1] =90;
        s2.marks[2]= 80;

        for (int i = 0; i < s2.marks.length; i++) {
            System.out.println(s2.marks[i]);
        }
;
    }
}
class Pen{
    // Properties + Functions
    String color;
    int tip;
    //  This is a getter
    String getColor(){
        return this.color;
    }
    // This is a setter
    void setColor(String newColor){
        color = newColor;
    }
    void setTip(int newTip){
        tip = newTip;
    }
}
class Student{
    String Name;
    int age;
    float percentage;
    void CalcPercentange(int phy, int chem, int maths){
        percentage = (float)(phy + chem + maths) / 3;
    }
    void setName(String name){
        Name  = name;
    }
    void setAge(int Age){
        age = Age;
    }
}
class BankAccount{
    private String pass;
    String name;
    int age;
    public String username;
    public void setPass(String pwd){
        pass = pwd;
    }

}

// Constructors
class Students{

    int marks[];
    String name;
    int roll;
    String password;
    // Non Parametrized Constructor
    Students(){
        // System.out.println();
    }
    // Parametrized Constructor
    Students(int name){
        // System.out.println();
    }
    // Copy Constructors
    Students(Students s2){
        this.password = s2.password;
        this.marks = s2.marks;
        this.name = s2.name;
        this.roll =s2.roll;


    }
}
class Animal{
    String color;
    void eats(){
        System.out.println("eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{
    int fins;
    void swims(){
        System.out.println("Swims");
    }
}