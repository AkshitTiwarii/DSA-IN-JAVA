public class main {
    public static void main(String[] args){
        Calc obj = new Calc();
        double result = obj.div(10.0,5.0);
        if(result ==2.0 ){
            System.out.println("Passed");
        }
        else
            System.out.println("failed");
    }
}
