class Monkey{
    void  jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BascAnimal{
    void eat();
    void sleep();
}

class  Human extends  Monkey implements BascAnimal{
    void speak(){
        System.out.println("Hello sir!");
    }

    @Override
    public void eat(){
        System.out.println("Eating...");
    }

    @Override
    public void sleep(){
        System.out.println("Sleeping...");
    }
}


public class pr_03problem {
    public static void main(String[] args) {
        // Question3: create a class Monkey with jump() and bite() 
        // methods. create a class Human which inherits this Monkey 
        // class and implements BascAnimal intercace with eat() and 
        // sleep() methosds.

        Human neeraj = new Human();
        neeraj.sleep();

    }
}
