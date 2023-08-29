package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>(3);
        arrayList.add("Balue1");
        arrayList.add("Value2");
        arrayList.add("Dalue3");

        System.out.println(arrayList);
        List<String> arrayList2 = new ArrayList<>(arrayList);

        System.out.println();
        Collections.sort(arrayList2);
        System.out.println(arrayList2);
    }
}
