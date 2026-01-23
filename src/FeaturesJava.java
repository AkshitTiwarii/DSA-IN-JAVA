// Local Variable Typed Instance (LVTI) is a var keyword which we use instead of any datatype declaration
// Sealed Classes using Sealed, non-sealed and Final Keyword
// Record Class = Record Class is an inbuild class which enables user to get the records
// of the data without creating a special class with all the overrides


//class Alien{
//    private final int id;
//    private final String name;
//
//    Alien(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//    public int getId(){
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    @Override
//    public String toString() {
//        return "Alien{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//} ---->ALL THIS SHIT CAN EASILY DONE USING RECORD CLASS



sealed class Ds permits Dm{
    int n = 10;
}

non-sealed class Dm extends Ds{
    public void prin(){
        System.out.println(n);
    }
}

record Alien(int id, String name){

}


public class FeaturesJava {
    public static void main(String[] args){
        int a = 0;
        var b = 100; // This is LVTI  we can use var instead of int and still it will stay statically types language

        Dm obj = new Dm();
        obj.prin();

        Alien a1 = new Alien(1,"Akshit");
        Alien a2 = new Alien(1,"Akshit");
        System.out.println(a1.equals(a2));
    }

}
