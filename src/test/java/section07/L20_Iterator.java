package section07;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class L20_Iterator {

    public static void main(String[] args) {

        List<String> animals = new ArrayList<String>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Tiger");
        animals.add("Chicken");
        animals.add("Pig");
        animals.add("Rabbit");
        animals.add("Mammal");
        animals.add("Bird");
        animals.add("Squid");
        animals.add("Fish");
        animals.add("Giraffe");

        Iterator<String> iterator = animals.iterator();

        while (iterator.hasNext()) {
            String animal = iterator.next();
            System.out.println(animal);
        }
    }
}
