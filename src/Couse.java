import java.util.Scanner;

public class Couse{
    public  static  void main(String[] args){



        human obj1 = new human();
        obj1.name = "Akshit";
        obj1.setage();
        human obj2 = new human();
        obj2.name = "Dash";
        obj2.setage();

        obj1.getdetails();
        obj2.getdetails();
    }
}

class human{
    Scanner sc = new Scanner(System.in);
    String name;
    private int age;

    void setage(){
     this.age = sc.nextInt();
    }

    void getdetails(){
        System.out.println(name+ ":"+ age);
    }

}