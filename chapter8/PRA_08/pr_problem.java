// package chapter8.PRA_08;

class Employee{
    int salary;
    String name;

    public int getSalary(){
        return salary;
    }

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
}

class CellPhone{
    public void ring(){
        System.out.println("Ringing...");
    }
    public void vibrate(){
        System.out.println("Vibrating...");
    }
    public void callFriend(){
        System.out.println("Calling Anu...");
    }
    
}

class Square{
    int side;
    public int area(){
        return side*side;
    }
    public int perimeter(){
        return 4*side;
    }
}

class Tommy{
    public void hit(){
        System.out.println("Hitting the enemy");
    }
    public void run(){
        System.out.println("Running the enemy");
    }
    public void fire(){
        System.out.println("Firing the enemy");
    }
}

public class pr_problem {
    public static void main(String[] args) {
        // Question1: create a class employee with following properties adn methods:
        // Salary(property)(int)
        // getSalary(method returning int)
        // name(property)(String)
        // getName(method returning string)
        // setName(method changing name)

        /* 
        Employee harry = new Employee();
        harry.setName("codewithharry");
        harry.salary= 334;
        System.out.println(harry.getSalary());
        System.out.println(harry.getName());
        */

        // Question2: create a class cellphone with methods to print 
        // "ringing...", "vibrating..." etc.

        /* 
        CellPhone asus = new CellPhone();
        asus.callFriend();
        asus.vibrate();
        asus.ring();
        */

        // Question3: create a class square with a method to initialize its side, 
        // calculating area, perimeter etc.

        /* 
        Square sq = new Square();
        sq.side = 3;
        System.out.println(sq.area());
        System.out.println(sq.perimeter());
        */

        // Question4: create a class rectangle & repeat 3

        // Question5: create a class TommyVecetti for Rockstar Games capable of 
        // hitting(print hitting...), running , firing etc.

        Tommy player1 = new Tommy();
        player1.fire();
        player1.run();
        player1.hit();

        // Question6: Repeat 4 for a circle.




    }
}
