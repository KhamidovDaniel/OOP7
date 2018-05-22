package lab8;

import java.util.HashSet;
import java.util.Iterator;
public class Plants {

    public static void main(String[] args) {
     HashSet<String> set = new HashSet<String>();
     set.add("арбуз");
     set.add("банан");
     set.add("вишня");
     set.add("груша");
     set.add("дыня");
     set.add("ежевика");
     set.add("жень-шень");
     set.add("земляника");
     set.add("ирис");
     set.add("картофель");
     
      Iterator<String> iterator = set.iterator();
        while (iterator.hasNext())
        {
          String text = iterator.next();
          System.out.println(text);
        }

    }   
}
