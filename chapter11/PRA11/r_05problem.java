class Monkey{
    void  jump(){
        System.out.println("Jumping...");
    }
    void bite(){
        System.out.println("Biting...");
    }
}

interface BasicAnimal{
    void eat();
    void sleep();
}

class  Human extends  Monkey implements BasicAnimal{
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

public class r_05problem {
    public static void main(String[] args) {
        // Question5: demonstrate polymorphism using 
        // monkey class from Q3.


        Monkey m1 = new Human();
        m1.jump();
        m1.bite();
        // m1.speak();  --> Cannot use speak method because the reference is monkey which does not have speak method

        BasicAnimal lovish = new Human();
        // lovish.speak();  --> Error
        lovish.eat();
        lovish.sleep();
        
    }
}
