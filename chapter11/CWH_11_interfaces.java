// package chapter11;

interface Bicycle{
    int a = 45;
    void applyBrake(int decrement);
    void speedUp(int increment);
}

interface HornBicycle{
    void blowHornk3g();
    void blowHornmhn();
}

class AvonCycle implements Bicycle, HornBicycle{
    void blowHorn(){
        System.out.println("Pee Pee Poo Poo");
    }
    public void applyBrake(int decrement){
        System.out.println("Applying Brake");
    }
    public void speedUp(int increment){
        System.out.println("Applying speedUp");
    }
    public void blowHornk3g(){
        System.out.println("kabhi khushi kabhi gum pee pee pee");
    }
    public void blowHornmhn(){
        System.out.println("Main hoon naa po po po");
    }
}

public class CWH_11_interfaces {
    public static void main(String[] args) {
        AvonCycle cycleHarry = new AvonCycle();
        cycleHarry.applyBrake(1);
        cycleHarry.blowHorn();
        cycleHarry.speedUp(4);

        // You can create properties in interface
        System.out.println(cycleHarry.a);

        // You cannot modify the properties in Interfaces as they are final
        // cycleHarry.a = 454;
        // System.out.println(cycleHarry.a);

        cycleHarry.blowHornk3g();
        cycleHarry.blowHornmhn();
    }
}
