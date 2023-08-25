package generics;

import java.util.ArrayList;
import java.util.List;

public class ParameterizedMethod {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("FS");
        list.add("SC");
        list.add("TH");
        System.out.println(GenMethod.getSecondElement(list));
    }
}

class GenMethod{
    public static <V> V getSecondElement(List<V> arrayList){
        return arrayList.get(1);
    }
}
