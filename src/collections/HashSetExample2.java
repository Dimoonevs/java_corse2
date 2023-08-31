package collections;

import java.util.HashSet;
import java.util.Set;

public class HashSetExample2 {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(5);
        set.add(2);
        set.add(3);
        set.add(8);
        set.add(1);

        Set<Integer> set2 = new HashSet<>();
        set2.add(5);
        set2.add(4);
        set2.add(3);
        set2.add(8);
        set2.add(7);

        Set<Integer> result = new HashSet<>(set);
        System.out.println(result);
//        result.addAll(set2);
//        result.retainAll(set2);
        result.removeAll(set2);
        System.out.println(result);


    }
}
