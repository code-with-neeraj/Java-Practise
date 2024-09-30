// package chapter7;

public class CWH_07_recursion {
    // factorial(n) = n * n-1 * ...1
    // factorial(5) = 5 * 4 * 3 * 2 * 1 = 120
    // factorial(n) = n * factorial(n-1)
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }
    static int factorial_iterative(int n){
        if(n==0 || n==1){
            return 1;
        }
        else{
            int product = 1;
            for (int i=1; i<=n; i++){
                product *= i;
            }
            return product;
        }
    }

    public static void main(String[] args) {
        int x = 4;
        System.out.println("The calue of factorial n is: " + factorial(x));
        System.out.println("The calue of factorial n is: " + factorial_iterative(x));
    }
}
