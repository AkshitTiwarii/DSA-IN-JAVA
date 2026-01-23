import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class streamapi {
    public static void main(String[] args){

        List<Integer> nums = Arrays.asList(4,5,7,6,2,3);
//        for(int n: nums){
//            System.out.println(n);
//        }
//        Stream<Integer> s1 = nums.stream();
//        Stream<Integer> s2 = s1.filter(n->n%2==0);
//        Stream<Integer> s3 = s2.map(m->m*2);
//        //s3.forEach(n-> System.out.println(n));
//        int result = s3.reduce(0,(c,e)->c+e);
//        System.out.println(result);
        //s2.forEach(n-> System.out.println(n));
        Predicate<Integer> p = (n)-> n%2==0;
        Function<Integer, Integer> f =n->n*2;

        int result = nums.stream()
                .filter(n->n%2==0)
                .map(n->n*2)
                .reduce(0,(c,e)->c+e);
        System.out.println(result);

//        int  sum =0;
//        for(int i : nums){
//            if(i%2==0){
//                i = i*2;
//                sum = sum +i;
//            }
//        }
//        System.out.println(sum);
    }

}
