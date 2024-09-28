// package chapter5;

public class CWH_05_for_loop {
    public static void main(String[] args) {
        // for(int i=1; i<=10; i++){
        //     System.out.println(i);
        // }

        // 2i = Even Number = 0, 2, 4, 6, 8
        // 2i+1 = Odd Number = 1, 3, 5, 7, 9
        // int n = 5;
        // for(int i=0; i<n; i++)
        // System.out.println(2*i+1);

        for (int i = 5; i>=0; i--) {
            System.out.println(i);
        }

        // Quick Quiz: write a program to print first n 
        // natural numbers in reverse order.

        int n= 50;
        for (int i = n; i>0; i--) {
            System.out.println(i);
        }

    }
}
