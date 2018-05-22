package newpackage;

/**
 *
 * @author gloom
 */
public class NewClass5 {
    public static void print (int n, int m){
        if (n>m) {
          System.out.println(n);  
        }
        else {
            System.out.println(m);
        }
           
    }
     public static void print (long s, long c){
        if (s>c) {
          System.out.println(s);  
        }
        else {
            System.out.println(c);
        }
    }
     
     public static void print (double v, double w){
        if (v>w) {
          System.out.println(v);  
        }
        else {
            System.out.println(w);
        }
    }
     
     public static void main(String[] args) {
         NewClass5 ob = new NewClass5();
         int n=2;
         int m=1;
         long s=2356;
         long c=593;
         double v=3.6;
         double w=4.5;
         ob.print(n, m);
         ob.print(s,c);
         ob.print(v,w);
     }
}
