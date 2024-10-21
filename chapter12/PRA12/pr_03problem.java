package folder.folder1.folder2;

class Calculator{
    public void calculator(int a, int b){
        System.out.println("Your result is: " + a+b);
    }
}
class ScCalculator{
    public void calculator(int a, int b){
        System.out.println("Your result is: " + Math.sin(a+b));
    }
}
class HyCalculator{
    public void calculator(int a, int b){
        System.out.println("Your result is: " + a+b);
        System.out.println("Your result is: " + Math.sin(a+b));
    }
}

public class pr_03problem {
    public static void main(String[] args) {
        // Question1: Use a built-in package in java to write a class which displays a message (by using sout) after taking input from the user.

        System.out.println("I am main method!");
    }
    
}
