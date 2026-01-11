public class bitwiseOperator {
    public static void main(String[] args){
        int n = 3;
        int a = 5;
        int i = 2;
        int bit = 1;
        int j = 4;
        System.out.println(fastExpo(a,n));
    }
    // To check if the number is odd or even using bit manipulation
    static void check(int n){
        if((n&1) ==1){
            System.out.println("The number is Odd");
        }else {
            System.out.println("The number is Even");
        }
    }
    static int getIthBit(int n, int i){
        int bitmask = 1<<i;
        // To find out the ith bit in a binary code we use n & (i<<1);
        if((n&bitmask) ==0){
            return 0;
        }
        return 1;
    }
    static int setIthBit(int n, int i){
        int bitmask = 1<<i;
        n = n|bitmask ;
        return n;
    }
    static int clearIthBit(int n,int i){
        int bitwise = 1<<i;
        n = n^bitwise;
        return n;
    }
    static int updateIthBit(int i, int n,int newbit){
        if(newbit == 1){
            return setIthBit(i,n);
        }else {
            return clearIthBit(i,n);
        }
    }
    static void lastIthBits(int n, int i){
        int bitmask = ~(0)<<i;
        n = n & bitmask;
        System.out.println(n);
    }
     static void RangeofBits(int n, int i,int j ){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a|b;
        n = n& bitmask;
         System.out.println(n);
     }
     static boolean powerOfTwo(int n){
        if((n & (n-1)) == 0){
            return true;
        }
        return false;
     }
     static int CountSetBit(int n) {
         int count = 0;
         while (n > 0) {
             if ((n & 1) != 0) {
                 count++;
             }
             n = n >> 1;
         }
         return count;
     }
     static int fastExpo(int a, int n){
        int ans = 1;
        while(n>0){
            if((n&1) !=0){
                ans = ans*a;
            }
            a =a *a;
            n = n>>1;
        }
        return ans;
     }

}
