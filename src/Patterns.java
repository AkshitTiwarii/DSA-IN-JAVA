public class Patterns {
    public static void main(String[] args){
        butterfly(4);
    }
    static void patterns(int n){
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void patterns1(int n){
        int num = n;
        for (int i = 0; i <= n; i++) {
            for (int j = num; j >0 ; j--) {
                System.out.print("*");

            }
            num--;

            System.out.println();
        }
    }
    static void hollowRectangle(int row, int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                if(i == 1|| i == row || j==1 || j == col){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    static void invertedTriangle(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();

        }

    }
    static void invertedPyramid(int n){
        int count =1;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <=n-i ; j++) {
                System.out.print(j);

            }
            count++;
            System.out.println();
        }

    }
    static void floyd(int n){
        int  count = 1;
        for (int i = 1; i <n ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(count + " ");
                count++;

            }
            System.out.println();
        }

    }
    static void zeroOneTriangle(int n){
        for (int i =0; i<=n;i++){
            for (int j = 0; j <= i; j++) {
                if((i+j)%2==0)
                {
                    System.out.print(1);
                }else {
                    System.out.print(0);
                }
            }
            System.out.println();
        }
    }
    static void butterfly(int n){
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i >0; i--) {
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            for (int j = 1; j <=2*(n-i) ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
