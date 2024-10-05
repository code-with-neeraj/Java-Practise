// package chapter8;

class Employee{
    int id;
    int salary;
    String name;
    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("and my name is "+ name);
    }
    public int getSalary(){
        return  salary;
    }
}

public class CWH_08_custom_class {
    public static void main(String[] args) {
        System.out.println("This is our custom class");
        Employee harry = new Employee();   // Instantiating a new Employee Object
        Employee neeraj = new Employee();   // Instantiating a new Employee Object


        // Setting Attrubutes harry
        harry.id = 12;
        harry.name = "CodeWithHarry";
        harry.salary= 3500000;

        // Setting Attrubutes neeraj
        neeraj.id = 13;
        neeraj.name = "Code-With-Neeraj";
        neeraj.salary= 34000;


        // Printing the Attributes
        
        harry.printDetails();
        neeraj.printDetails();
        int salary = neeraj.getSalary();
        System.out.println(salary);
        // System.out.println(harry.id);
        // System.out.println(harry.name);
    }
    
}
