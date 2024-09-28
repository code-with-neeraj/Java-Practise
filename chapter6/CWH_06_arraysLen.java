// package chapter6;

public class CWH_06_arraysLen {
    public static void main(String[] args) {
        /* 
        float [] marks = {98.1f, 34.3f, 35.5f, 56.4f, 46.7f};
      
        String [] students = {"Neeraj", "Rohan", "Shubham", "Lovish"};
        System.out.println(students[0]);
        System.out.println(students.length);
        */

        int [] marks = {98, 34, 35, 56, 46};
        System.out.println("length of marks: "+marks.length);

        // Displaying the Array (Naive way)
        System.out.println("Printing using for Naive way");
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Displaying the Array (for loop)
        System.out.println("Printing using for loop");
        for(int i=0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

        // Quick Quiz: Write a java program to print the elemnets of an array in reverse order:
        // Displaying the Array in Reverse order (for loop)
        System.out.println("Printing using for loop in reverse order");
        for(int i=marks.length -1; i>=0; i--){
            System.out.println(marks[i]);
        }

        // Displaying the Array (for-each loop)
        System.out.println("Printing using for-each loop");
        for(int elemnet: marks){
            System.out.println(elemnet);
        }
    }
    
}
