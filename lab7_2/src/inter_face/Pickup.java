package inter_face;

public class Pickup implements CargoAuto, PassangerAuto{
     public void transportPassanger() {
        System.out.println("Везу пассажиров");
        }
     
     public void transportCargo() {
        System.out.println("Везу груз");
        }
     
      public static void main(String[] args){ 
        Pickup ob= new Pickup();
       ob.transportPassanger();
       ob.transportCargo();
    }
}
