package newpackage;

public class NewClass3 {
     public void print(int n){
        System.out.println(n);
    }
     
     public void print(String s){
        System.out.println(s);
    }
     
      public void print(Integer i){
         System.out.println(i);
    }
      
       static public void print(double m){
         System.out.println(m);
    }
       
        static public void print(char d){
         System.out.println(d);
    }
        
        public static void main(String[] args) {
         NewClass3 ob = new NewClass3();
         int n=1;
         String s= "Hello World";
         Integer i= new Integer(2);
         double m= 3;
         char d= 'a';
         ob.print(n);
         ob.print(s);
         ob.print(i);
         ob.print(d);
         ob.print(m);
     }
}