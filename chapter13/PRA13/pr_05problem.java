public class pr_05problem {
    
}
// package PRA13;

class Practice13 extends Thread {
    public void run(){
        while (true) { 
            System.out.println("Good Morning!");
        }
    }
}

class Practice13b extends Thread {
    public void run(){
        // while (false) {
        //     try {
        //         Thread.sleep(200);
        //     } catch (Exception e) {
        //         System.out.println(e);
        //     }
            
        //     System.out.println("Welcome!");
        // }
    }
}

public class pr_05problem {
    public static void main(String[] args) {
        // Question4: How do you get state of a given thread in java.
        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        // p1.setPriority(6);
        // p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        System.out.println(p2.getState());
        // p1.start();
        p2.start();
        System.out.println(p2.getState());
        System.out.println(Thread.currentThread().getState());
    }
}
