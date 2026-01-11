interface AF{
     void status();
     void marks();
}

class B implements AF{
    public void status(){
        System.out.println("in B");
    }
    public void marks(){
        System.out.println("Hell marks");
    }
}



public class inface {
    public static void main(String[] args){
        AF obj = new B();
        obj.marks();
        obj.status();

        // Instanciated Using Aynominous Inner Class
//        num object = new num() {
//            public void count() {
//            }
//        };
        num object = () -> {
            System.out.println("Hello");
        };
        object.count();

    }
}

// There are three types of interfaces
// 1- Normal : These have two or more methods
// 2- Functional Interface or SAM(Single Argument Method): Have only 1 function
// 3 - Marker Interface : Have 0 functions

@FunctionalInterface
interface num{
    void count();
}

//Now to shorten the code we use Lambda Expression (->) with Functional interface
