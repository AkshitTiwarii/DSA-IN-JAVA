public class recursion {
    public static void main(String[] args){
        int n = 10;
        System.out.println(sumofN(n));
    }
    // To print number from n to 1 in decreasing order
    public static void printnum(int n){
        if(n == 1){
            System.out.println(1);
            return;
        }
        System.out.print(n +" ");
        printnum(n-1);
    }
    // To print number from 1 to n
    static void printInc(int n){
        if(n == 1){
            System.out.print(1 + " ");
            return;
        }

        printInc(n-1);
        System.out.print(n +" ");
    }
    // To find the factorial of N
    static int factorial(int n){
        if(n==1 || n ==0){

            return 1;

        }
        return n* factorial(n-1);
    }
    static int sumofN(int n){
        if(n == 1){
            System.out.print(1 + " ");
            return 1;
        }

        return n + sumofN(n-1);

    }
}
