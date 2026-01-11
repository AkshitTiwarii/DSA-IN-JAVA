package calulators;

public class advCalc extends calc {
    public void multiply(int a, int b){
        int c = a*b;
        System.out.println(c);
    }
    public void divide(int a, int b){
        if(b!=0){
            double c = a/b;
            System.out.println(c);
        }else {
            System.out.println("Divide By Zero Error");
        }
    }

}
