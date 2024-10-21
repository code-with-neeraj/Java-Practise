// package PRA_10;

class Circle{
    public int radius;
    
    Circle() {
        System.out.println("I am non param of circle");
    }

    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }

    public double  area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;
    Cylinder1(int r, int h){
        super(r);
        System.out.println("I am cylinder parameterized constructor");
        this.height = h;
    }
    
    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class pr_01problem {
    public static void main(String[] args) {
        // Question:1 ceate a class and use inheritance 
        // to create another class cylinder from it.

        // Circle objc = new Circle(12);
        Cylinder1 obj = new Cylinder1(12, 3);
    }
}
