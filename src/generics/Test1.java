package generics;

import java.util.ArrayList;
import java.util.List;

public class Test1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("String");
//        list.add(2);
//        list.add(new StringBuilder("StringBuilder"));
//        list.add(new Car());
        list.add("String1");
        list.add("String2");
        list.add("String3");
        list.add("String4");
//        list.add(new Car());
        for (Object o : list) {
            System.out.println(o + " dlina " + ((String)o).length());
        }
    }
}
class Car{

}
