package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set =new HashSet<>();
        set.add("Dima");
        set.add("Oleg");
        set.add("Marina");
        set.add("Igor");
//        set.add(null);

//        System.out.println(set);
        System.out.println(set.contains("Oleg"));

        System.out.println(set.size());
        set.remove("Oleg");
        System.out.println(set.size());
//        System.out.println(set.isEmpty());
        System.out.println(set.contains("Oleg"));
        for (String s: set){
            System.out.println(s);
        }

    }
}
