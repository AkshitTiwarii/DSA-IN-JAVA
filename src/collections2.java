import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class  Student1  implements Comparable<Student1>{
    int age;
    String name;
    public void student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public String toString(){
        return "Student [age = " + age + "name = "+ name + "]";
    }
    public int compareTo(Student1 that) {
        return 0;
    }

}


public class collections2 {
    public static void main(String[] args) {
        Comparator<Student1> cmp = new Comparator<Student1>() {
            public int compare(Student1 i, Student1 j) {

                if (i.age > j.age) {
                    return 1;
                } else
                    return -1;
            }
        };
        List<Student1> std = new ArrayList<Student1>();

    }

}
