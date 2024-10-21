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

public class pr_01problem {
    public static void main(String[] args) {
        // Question1: write a program to print 
        // "good morning" and "welcome" continuously on 
        // the screen in java using Thread.

        Practice13 p1 = new Practice13();
        Practice13b p2 = new Practice13b();
        p1.start();
        p2.start();
    }
}