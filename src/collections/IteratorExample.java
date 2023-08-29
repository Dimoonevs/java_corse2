package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dima");
        arrayList.add("Anton");
        arrayList.add("Vova");
        arrayList.add("Petya");
        arrayList.add("Elena");
        Collections.sort(arrayList);
        Iterator<String> iterator = arrayList.iterator();


        while (iterator.hasNext()){

            iterator.next();
            iterator.remove();
        }
        System.out.println(arrayList);

    }
}
