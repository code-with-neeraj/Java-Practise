// package chapter4;

public class CWH_04_logical {
    public static void main(String[] args) {
        System.out.println("For Logical AND...");
        boolean a = true;
        boolean b = false;
        if (a && b){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical OR...");
        boolean a1 = true;
        boolean b1 = false;
        if (a1 || b1){
            System.out.println("Y");
        }
        else{
            System.out.println("N");
        }

        System.out.println("For Logical NOT");
        System.out.print("Not(A) is ");
        System.out.println(!a);
        System.out.print("Not (b) is ");
        System.out.println(!b);

    }
}
