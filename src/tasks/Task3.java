// Создать список типа ArrayList<String>.
// Поместить в него как строки, так и целые числа.
// Пройти по списку, найти и удалить целые числа.

package tasks;

import java.util.ArrayList;

public class Task3 {
    public static void deleteIntegers() {
        ArrayList ourArray = new ArrayList<String>();
        ourArray.add("ура!");
        ourArray.add(1);
        ourArray.add("Привет!");
        ourArray.add(158);
        System.out.println(ourArray);
        for (int i = 0; i < ourArray.size(); i++) {
            if (ourArray.get(i) instanceof Integer) ourArray.remove(ourArray.get(i));
        }
        System.out.println(ourArray);
    }
}
