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
        while (true) { 
            System.out.println("Welcome!");
        }
    }
}

public class pr_03problem {
    public static void main(String[] args) {
        // Question3: Demonstrate getPriority()
        // and setPriority() methods in java Thread.

        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        p1.setPriority(6);
        p2.setPriority(9);
        System.out.println(p1.getPriority());
        System.out.println(p2.getPriority());
        // p1.start();
        // p2.start();
    }
}
