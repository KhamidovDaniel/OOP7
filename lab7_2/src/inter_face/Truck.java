package inter_face;

public class Truck implements CargoAuto{
    public void transportCargo() {
        System.out.println("Везу груз");
        }
    public static void main(String[] args){ 
       Truck ob= new Truck();
       ob.transportCargo();
    }
}
