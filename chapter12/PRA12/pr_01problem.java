package calc;

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

public class pr_01problem {
    public static void main(String[] args) {
        // Question1: Create three class Calculator, ScCalculator and HybridCalculator and group them into a package.

        System.out.println("I am main method!");
    }
    
}
