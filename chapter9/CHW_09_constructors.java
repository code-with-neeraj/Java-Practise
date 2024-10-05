class MyMainEmployee{
    private int id;
    private String name;

    public MyMainEmployee(){
        id = 45;
        name = "Your-name-Here";
    }

    public MyMainEmployee(String myName, int myId){
        id = myId;
        name = myName;
    }

    public String getName() {return  name;}
    public void setName(String n) {this.name = n;} 
    public void setId(int i ) { this.id = i;}
    public int getId() {return id;}

}

public class CHW_09_constructors {
    public static void main(String[] args) {
        MyMainEmployee harry = new MyMainEmployee();
        // harry.setName("codewithharry");
        // harry.setId(34);
        System.out.println(harry.getId());
        System.out.println(harry.getName());
    }
}
