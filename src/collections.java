// There are 3 different things with same name
// 1- Collection Interface
// 2- Collections Class
// 3- Collection API


import java.util.*;

// Collection cannot be directly used as a class and create an object of it thus,
// Collection consists sub parts like Sets, Queue, Lists
// These many also consists of internal classes such as Sets have - Hashset, Linkedset,
// Queue have enqueue, dequeue
// List have LinkedList, ArrayList

public class collections {
    public static void main(String[] args){

        Comparator<String> com = new Comparator<String>() {
            public int compare(String o1, String o2) {
                return Integer.compare(o2.length(), o1.length());
            }
        };

        //Collection<Integer> nums = new ArrayList<Integer>();
        List<String> str = new ArrayList<String>();
        str.add("Hi");
        str.add("Hii");
        str.add("h");
        str.add("Hell");
        str.add("Heyyalll");
        str.add("riches");
        Collections.sort(str,com);

        for (String i : str ) {
            System.out.println(i);
        }


//        List<Integer> nums = new ArrayList<Integer>();
        //Set<Integer> nums = new HashSet<Integer>();
//        Collection <Integer> nums = new TreeSet<Integer>();
//        nums.add(10);
//        nums.add(14);
//        nums.add(13);
//        nums.add(12);
//        nums.add(1);
//        Collections.sort(nums);
//        for (int i : nums){
//
//            System.out.println(i);
//        }
//        System.out.println(nums.get(2));
//        System.out.println(nums);
//        Map<String, Integer> student = new HashMap<>();
//        student.put("Akshit", 23);
//        student.put("Rajan", 24);
//        student.put("Paras", 20);
//        student.put("Daksh", 22);
//        System.out.println(student);
    }
}
