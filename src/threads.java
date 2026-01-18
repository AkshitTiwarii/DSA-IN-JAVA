// Threads is a process of dividing a task into small different task
//class D implements Runnable {
//    public void run(){
//        for(int i =0;i<10;i++){
//            System.out.println("hi");
//        try{
//            Thread.sleep(10);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }}
//    }
//
//}
//
//class C implements Runnable{
//    public void run(){
//        for(int i =0;i<10;i++){
//            System.out.println("yello");
//
//            try{
//            Thread.sleep(10);
//        } catch (InterruptedException e){
//            e.printStackTrace();
//        }
//        }
//    }
//
//}

import java.security.DrbgParameters;

class C extends Thread{
    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println("hello");
        }
    }
}
class D extends Thread{

    public void run(){
        for (int i = 0; i <100 ; i++) {
            System.out.println("hi");
        }

    }
}

class Counter{
    int count =0;
    public synchronized void  count(){
        count++;
    }
}

public class threads  {
    public static void main(String[] args) throws InterruptedException{
//        Runnable obj = new D();
//        Runnable obj1 = new C();
//
//        Thread t1 = new Thread(obj);
//        Thread t2 = new Thread(obj1);
//
//        t1.start();
//        t2.start();

        C obj = new C();
        D obj1 = new D();

        obj.start();
        obj1.start();

        Counter c = new Counter();
        Runnable R1 = ()->{
            for (int i = 0; i < 10000; i++) {
                c.count();
            }
        };

        Runnable R2 = ()->{
            for (int i = 0; i < 10000; i++) {
                c.count();
            }
        };
        Thread t1 = new Thread(R1);
        Thread t2 = new Thread(R2);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.out.println(c.count);
    }
}

// What is race condition?
// When multiple of threads with same method works simultaneously it creates a condition known as race condition
// so to prevent this we use "synchronized" keyword.

// We can initialize threads in 2 ways
// Directly by extending from thread class OR using implements in Runnable class as it is also inherited by the Thread class

// There are many states in a thread like
// New(When a new thread is created)
// Runnable
// Running
// Waiting
// Dead