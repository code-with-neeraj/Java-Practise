
import java.util.Scanner;

// package PRA_14;

public class pr_01problem {
    public static void main(String[] args) {
        // Question1: Write a java program to 
        // demonstrate syntax, logical & runtime errors.

        // Syntax Error
        // int a = 9

        // Logical errors
        // int age = 70;
        // int year_born = 2000-78;

        // Runtime errors
        // System.out.println(6/8);

        // Question2: Write a java program that prints "HaHa" 
        // during Arithmetic Exception and "HeHe" during an 
        // Illegal argument exception

        // try {
        //     int a = 666/0;
        // } catch (IllegalArgumentException e) {
        //    System.out.println("HaHa"); 
        // }
        // catch (ArithmeticException e) {
        //     System.out.println("HeHe");
        // }

        // Question3: write a program that allows you to keep 
        // accessing an array until a valid index is given. If 
        // max retries exceed 5 print "Error".

        boolean flag = true;
        int [] marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[2] = 6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i = 0;
        while(flag && i<5){
            try{
                System.out.println("Enter the calue of index: ");
                index = sc.nextInt();
                System.out.println("The value of marks[index] is " + marks[index]);
                break;
            }
            catch(Exception e) {
                System.out.println("Invalid Index");
                i++;
            }
        }
        if(i>=5){
            System.out.println("Error");
        }



    }
}
