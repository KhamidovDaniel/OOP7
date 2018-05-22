package lab8;

import java.util.HashMap;
import java.util.Iterator;

public class zadanie_2 {
     public static void main(String[] args) {
    /*арбуз - ягода, банан - трава, вишня - ягода, груша - фрукт, дыня - овощ, 
    ежевика - куст, жень-шень - корень, земляника - ягода, ирис - цветок, картофель - клубень*/
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("арбуз", "ягода");
    map.put("банан", "трава");
    map.put("вишня", "ягода");
    map.put("груша", "фрукт");
    map.put("дыня", "овощ");
    map.put("ежевика", "куст");
    map.put("жень-шень", "корень");
    map.put("земпляника", "ягода");
    map.put("ирис", "цветок"); 
    map.put("картофель", "клубень");
    
    Iterator<HashMap.Entry<String, String>> iterator = map.entrySet().iterator();

    while (iterator.hasNext())
    {
        //получение «пары» элементов
        HashMap.Entry<String, String> pair = iterator.next();
        String key = pair.getKey();            //ключ
        String value = pair.getValue();        //значение
        System.out.println(key + "-" + value);
    }

    }
}