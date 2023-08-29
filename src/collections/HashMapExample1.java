package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample1 {
    public static void main(String[] args) {
        Map<Integer, String> map1 = new HashMap<>();

        map1.put(1000, "Dima Yevsiukov");
        map1.put(14450, "Ivan Ivanov");
        map1.put(1048185, "Nikolai Petrov");
        map1.put(10155, "Maria Sidorova");
        map1.put(5287, "Ермак Сидеть!");
        map1.putIfAbsent(14450, "Oleg Solovei");

        System.out.println(map1);
//        System.out.println(map1.get(1000));
        map1.remove(1048185);
        System.out.println(map1);
//        System.out.println(map1.containsValue("Ермак Сидеть!"));
//        System.out.println(map1.containsValue("Ермак Сидеть"));
//        System.out.println(map1.containsKey(5287));
//        System.out.println(map1.containsKey(52871));
//        System.out.println(map1.keySet());
        System.out.println(map1.values());
    }
}
