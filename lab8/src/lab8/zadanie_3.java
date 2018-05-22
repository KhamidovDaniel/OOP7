package lab8;

import java.util.HashMap;
import java.util.Iterator;

public class zadanie_3{
    public static void main(String args[]) {
        Cat[] cats = new Cat[10];
        String[] names = new String []{
            "Барсик", "Пушок", "Тимоша", "Муська", "Дымок", "Буся", "Кузя", "Васька", "Мурка", "Ласка",
        };
     
    HashMap<String, Cat> map = new HashMap<String, Cat>();
     for (int i = 0; i < 10; i++) {
            cats[i] = new Cat(names[i]);
            map.put(cats[i].get_name(), cats[i]);
        }
     Iterator<HashMap.Entry<String, Cat>> iterator = map.entrySet().iterator();

    while (iterator.hasNext())
    {
        //получение «пары» элементов
        HashMap.Entry<String, Cat> pair = iterator.next();
        String key = pair.getKey();            //ключ
        Cat value = pair.getValue();        //значение
        System.out.println(key + "-" + value);
    }
    }
    
}
