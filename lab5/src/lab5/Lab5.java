package lab5;

import java.util.Scanner;

public class Lab5 {

    Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Lab5 o1 = new Lab5();
        o1.printCircle(); // Окружность с центром (0.0;0.0) и радиусом 1.0
        o1.circleLong();
        o1.moveCircle();
        Lab5 o2 = new Lab5();
        o2.printCircle(); 
        o2.circleLong();
        o2.moveCircle();      
        System.out.println("Расстояние между центрами: " + Math.floor(distanceCircle(o1,o2)));
        if (touchCircle(o1, o2)) 
            System.out.println("Окружности касаются");
        else
            System.out.println("Окружности не касаются");
    }
    public double x;
    public double y;
    public double r;
    
    public static double distanceCircle(Lab5 o1, Lab5 o2) { //расстояние между центрами
       double a = (o2.x - o1.x);
       double b = (o2.y - o1.y); 
       return Math.sqrt(a*a+b*b);          
    }
    
    public static boolean touchCircle(Lab5 o1, Lab5 o2){ //соприкосновение окружностей
        double dist = distanceCircle(o1, o2);
        if ((dist > o1.r) && (dist > o2.r)) {
            if (dist - (o1.r + o2.r) == 0)
                return false;
            else return true;     
        }else{
            if (o1.r > o2.r){
                if(o1.r - (o2.r + dist) == 0)
                    return true;
                else return false;
            }else{
                if(o2.r - (o1.r + dist) == 0)
                    return true;
                else return false;
            }            
        }           
    }
    public void circleLong(){ //длина окружности
        System.out.println("Длина окружности: " + (int)Math.floor(2 * Math.PI * this.r));
    }
    public void printCircle() { //данные о окружности
        System.out.println("Окружность с центром ("+(int)x+";"+(int)y+") и радиусом "+(int)r);
    }    

    public void moveCircle() {    //перемещение центра
        x = (Math.floor(Math.random()*198)-99);
        if (x > 99) x = 99;
        if (x < -99) x =-99;
        y = (Math.floor(Math.random()*198)-99);
        if (y > 99) x = 99;
        if (y < -99) x =-99;
        System.out.println("Центр перемещен в: ["+(int)x+";"+(int)y+"]");
    }
    

    public Lab5
        () {
        System.out.println("Введите Х: ");
        x = sc.nextInt();
        System.out.println("Введите У: ");
        y = sc.nextInt();
        System.out.println("Введите R: ");
        r = sc.nextInt();
    }


}
   