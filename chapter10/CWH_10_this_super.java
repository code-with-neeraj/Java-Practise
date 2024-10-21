// package chapter10;

class EkClass{
    int a;
    public int getA() {
        return a;
    }
    
    EkClass(int v) {
        this.a = v;
    }
    
    public int returnone(){
        return 1;
    }

}

class DoClass extends  EkClass{
    DoClass(int c){
        super(c);
        System.out.println("i am a constructor");
    }
}

public class CWH_10_this_super {
    public static void main(String[] args) {
        EkClass e = new EkClass(5);
        DoClass d = new DoClass(53);
        System.out.println(e.getA());
    }
}
