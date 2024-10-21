abstract  class Pen{
    abstract void write();
    abstract void refill();
}

class FountainPen extends Pen{
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

public class pr_01_02problem {
    public static void main(String[] args) {
        // Question1: create an acstract class Pen 
        // with method write() and refill() as abstract methods

        // Question2: use the pen class from Q1 to create a concrete 
        // class fountainPen with additional method changeNib()

        FountainPen pen = new FountainPen();
        pen.changeNib();

    }
}
