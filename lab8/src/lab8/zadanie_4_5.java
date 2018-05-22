package lab8;

import java.util.HashMap;

public class zadanie_4_5 {
       public static void main(String args[]) {
        HashMap<String, String> map = new HashMap<String, String>();
    map.put("1", "значение1");
    map.put("2", "значение2");
    map.put("3", "значение3");
    map.put("4", "значение4");
    map.put("5", "значение5");
    map.put("6", "значение6");
    map.put("7", "значение7");
    map.put("8", "значение8");
    map.put("9", "значение9"); 
    map.put("10", "значение10");
    
   
        for(HashMap.Entry<String, String> pair : map.entrySet())
        {
            String key = pair.getKey();
            System.out.println(key);
        }
        
        for(HashMap.Entry<String, String> pair : map.entrySet())
        {
            String value = pair.getValue();
            System.out.println(value);
        }
    }
       
}
