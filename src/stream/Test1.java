package stream;

import java.util.*;
import java.util.stream.Collectors;

public class Test1 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        stringList.add("one");
        stringList.add("two");
        stringList.add("three");
        stringList.add("four");

//        for (int i = 0; i < stringList.size(); i++){
//            stringList.set(i, String.valueOf(stringList.get(i).length()));
//        }

        List<Integer> list2 = stringList.stream().map(element->element.length())
                        .collect(Collectors.toList());

//        System.out.println(stringList);
//        System.out.println(list2);

        int[] array = {5,9,3,8,1};
        array = Arrays.stream(array).map(element
                ->{if (element%3 == 0){
                    element = element/3;
                }
                return element;
        }).toArray();
//        System.out.println(Arrays.toString(array));

        Set<String> set = new TreeSet<>();

        set.add("one");
        set.add("two");
        set.add("three");
        set.add("four");
        System.out.println(set);
        Set<Integer> set2 = set.stream().map(element-> element.length()).collect(Collectors.toSet());
        List<Integer> list3 = set.stream().map(element-> element.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(list3);
    }
}
