package lab7_1;

public class Lab7_1 {

public static class Cow {
    public void getName() {
    System.out.println("Я - корова");
    }
}

public static class Whale extends Cow{
    public void getName() {
    System.out.println("Я не корова, Я – кит.");
    }
}
    public static void main(String[] args) {
        Cow whale= new Whale();
        whale.getName();
    }
    
}
