package inter_face;

public class Sedan implements PassangerAuto {
    public void transportPassanger() {
        System.out.println("Везу пассажиров");
        }
    public static void main(String[] args){ 
        Sedan ob= new Sedan();
       ob.transportPassanger();
    }
}
