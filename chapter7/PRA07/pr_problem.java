// package PRA07;

public class pr_problem {
    /*
    static void multiplication(int n){
        for (int i=1; i<=10; i++){
            System.out.format("%d X %d = %d\n", n, i, n*i);
        }
    }
     */
    /* 
    static  void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    */

    /* 
    //  sum(n) = 1 + 2 + 3... + n
    //  sum(n) = 1 + 2 + 3... + n-1 + n
    //  sum(n) = sum(n-1) + n
    static int sumRec(int n){
        if(n==1){
            return 1;
        }
        return n + sumRec(n-1);
    }
    */

    /*
    static int fib(int n){
        // if(n==1){
        //     return  0;
        // }
        // else if(n==2){
        //     return  1;
        // }
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fib(n-1) + fib(n-2);
        }
    } 
     */
    
    /* 
    static  void pattern1_rec(int n){
        if(n>0){
           pattern1_rec(n-1);

           for(int i=0; i<n; i++){
                System.out.print("*");
        }
        System.out.println();
       }
    }
    */
    

    public static void main(String[] args) {
        // Question1: write a java method to print multiplication table of a number n.

        // multiplication(7);

        // Question2: write a program using functions to print the following pattern:
        // *
        // **
        // ***
        // ****

        // pattern1(4); 

        // Question3: write arecursive function to calculate sum of first n natural numbers.

        // int c = sumRec(10);
        // System.out.println(c);

        // Question4: write a function to print the following pattern 
        // ****
        // ***
        // **
        // *

        // Question5: write a function to print nth term of fibonacci series usiing recursion.
        // fibonacci series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34

        // int result = fib(5);
        // System.out.println(result);


        // Question6: write a function to find average of a set of numbers passed as arguments.

        // Question7: Repeat 4 using Recursion.

        // Question8: Repeat 2 using Recursion.

        pattern1_rec(4); 

        // Question9: write a function to convert Celsius temperature into fahrenheit.

        // Question10: Repeat 3 using iterative approach.
    }
    
}
