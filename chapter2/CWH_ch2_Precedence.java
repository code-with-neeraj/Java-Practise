// package chapter2;

public class CWH_ch2_Precedence {
    public static void main(String[] args) {
         // Precedence & Associativity
        // int a = 6*5-34/2;
        /*
        =30-34/2
        =30-17
        =13
        */
        // System.out.println(a);
        
        // int b = 60/5-34*2;
        /* 
        =12-34*2
        =12-68
        =-56
        */
        // System.out.println(b);


        // Quick Quiz
        // int x = 6;
        // int y = 1;
        // int k = x * y/2;

        int a = 5;
        int b = 1;
        int c = 4;
        int k = b * b -(4*a*c)/(2*a);

        System.out.println(k);
       
    }
}
