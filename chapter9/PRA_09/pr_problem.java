// package PRA_09;
   
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
    public double surfaceArea(){
        return 2* Math.PI* radius * radius + 2*Math.PI*radius*height;
    }
    public double volume(){
        return Math.PI * radius * radius * height;
    }


}

class Rectangle{
    private int length;
    private int breadth;

    public Rectangle() {
        this.length = 4;
        this.breadth = 5;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class pr_problem {
    public static void main(String[] args) {
        // Question1: create a class cylinder and use getters and setters to set its radius and height.
       
        Cylinder myCylinder = new Cylinder(9, 12);
        //myCylinder.setHeight(12);
        System.out.println(myCylinder.getHeight());
        //myCylinder.setRadius(9);
        System.out.println(myCylinder.getRadius());

        // Question2: use 1 to calculate surface area and volume of the cylinder.
        System.out.println(myCylinder.surfaceArea());
        System.out.println(myCylinder.volume());

        // Question3: use a constructor and repeat 1.
        Rectangle r = new Rectangle(12, 56);
        System.out.println(r.getLength());
        System.out.println(r.getBreadth());

        // Question4: overload a constructor used to initialize a rectangle of length 4 and breadth 5 for using custom parameters.


        // Question5: Repeat 1 for a sphere.
    }
}
