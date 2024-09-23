// package chapter2.PRA02;

public class pr_02_problem {
    public static void main(String[] args) {
        // Question2: write a java program to encrypt a grade by adding 8 to it.
        //  Decrypt it to show the correct grade
        
        char grade = 'B';
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypting the grade
        grade = (char)(grade - 8);
        System.out.println(grade);
    }
}
