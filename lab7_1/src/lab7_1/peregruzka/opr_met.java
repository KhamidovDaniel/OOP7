package lab7_1.peregruzka;

public class opr_met {
    public static void main(String[] args) {
         opredelenie ob = new opredelenie();
         cat cat = new cat();
         dog dog = new dog();
         bird bird = new bird();
         lamp lamp = new lamp();
         ob.method(cat);
         ob.method(dog);
         ob.method(bird);
         ob.method(lamp);
     }
}
