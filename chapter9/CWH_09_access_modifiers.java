// package chapter9;

class  MyEmployee{
    private int id;
    private  String name;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public void setId(int i){
        id = i;
    }
    public int getId(){
        return id;
    }
    
}

public class CWH_09_access_modifiers {
    public static void main(String[] args) {
        MyEmployee harry = new MyEmployee();
        // harry.id = 45;
        // harry.name = "codewithharry"; --> Throw and error due to private access modifier

        harry.setName("codewithharry");
        System.out.println(harry.getName());
        harry.setId(456);
        System.out.println(harry.getId());
    }
   
}
