// package chapter10;

class Base{
    int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        System.out.println("I am base and setting x now");
        this.x = x;
    }
       
    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{
    int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

}

public class CWH_10_inheritance {
    public static void main(String[] args) {
        // Creating an object of base class
        Base b = new Base();
        b.setX(4);
        System.out.println(b.getX());

        // Creating an object of derived class
        Derived d = new Derived();
        d.setX(43);
        System.out.println(d.getX());
    }
}
