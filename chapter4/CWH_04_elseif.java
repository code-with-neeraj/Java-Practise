// package chapter4;

import java.util.Scanner;

public class CWH_04_elseif {
    public static void main(String[] args) {
        int var;
        System.out.print("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        var = sc.nextInt();

        switch(var){
            case 18:
                System.out.println("You are going to become an Adult!");
                break;
            case 23:
                System.out.println("You are going to become a Job!");
                break;
            case 60:
                System.out.println("You are going to get retired!");
                break;
            default:
                System.out.println("Enjoy Your life!");
        }
        /*
        switch(var){
            case 18 -> System.out.println("You are going to become an Adult!");
            case 23 -> System.out.println("You are going to become a Job!");
            case 60 -> System.out.println("You are going to get retired!");
            default -> System.out.println("Enjoy Your life!");
        }
        */




        /* 
         int age;
        System.out.print("Enter Your Age: ");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();

        if(age>56){
            System.out.println("You are experienced!");
        }
        else if(age>46){
            System.out.println("You are semi-experienced!");
        }
        else if(age>36){
            System.out.println("You are semi-semi-experienced!");
        }
        else{
            System.out.println("You are not experienced!");
        }
        */
    }
    
}
