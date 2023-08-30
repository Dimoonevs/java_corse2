package collections;

import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<Double, StudentEqualsHashCode> treeMap = new TreeMap<>();
        StudentEqualsHashCode st1 = new StudentEqualsHashCode("Dima", "Yevsiukov", 5);
        StudentEqualsHashCode st2 = new StudentEqualsHashCode("Anton", "Sidorov", 3);
        StudentEqualsHashCode st3 = new StudentEqualsHashCode("Maria", "Zaharova", 4);
        StudentEqualsHashCode st4 = new StudentEqualsHashCode("Oleg", "Solovei", 1);
        StudentEqualsHashCode st5 = new StudentEqualsHashCode("Ivan", "Ivanov", 2);
        StudentEqualsHashCode st6 = new StudentEqualsHashCode("Ермак", "Сидеть!", 2);
        StudentEqualsHashCode st7 = new StudentEqualsHashCode("Vasiliy", "Smirnov", 2);
        treeMap.put(8.6,st4);
        treeMap.put(7.4,st5);
        treeMap.put(5.8,st1);
        treeMap.put(5.6,st7);
        treeMap.put(6.2,st2);
        treeMap.put(5.3,st3);
        treeMap.put(1.1,st6);

        System.out.println(treeMap);
        System.out.println(treeMap.containsValue(new StudentEqualsHashCode("Ермак", "Сидеть!", 2)));

//        System.out.println(treeMap);
//        System.out.println(treeMap.tailMap(6.0));
//        System.out.println(treeMap.headMap(6.0));
//        System.out.println(treeMap.lastEntry());
//        System.out.println(treeMap.firstEntry());
//        System.out.println(treeMap.get(5.8));
//        treeMap.remove(5.6);
//        System.out.println(treeMap);
//        System.out.println(treeMap.descendingMap());

    }
}
