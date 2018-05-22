package lab8;

import java.util.HashMap;
import java.util.Iterator;

public class zadanie_6 {
    public static void main(String args[]) {
    HashMap<String, Object> map = new HashMap<String, Object>();
    map.put("Sim", 5);
    map.put("Cat", 3);
    map.put("Double", 5.0);
    map.put("Int", 77);
    map.put("Booulean", "false");
    map.put("Eat", "true");
    map.put("Voice", "Gaw-gaw");
    map.put("Dog", "pet");
    map.put("Human", "monkey");
    map.put("Cat", "pet");
    
    Iterator<HashMap.Entry<String, Object>> iterator = map.entrySet().iterator();

    while (iterator.hasNext())
    {
        //получение «пары» элементов
        HashMap.Entry<String, Object> pair = iterator.next();
        String key = pair.getKey();            //ключ
        Object value = pair.getValue();        //значение
        System.out.println(key + "-" + value);
    }
    }
}
