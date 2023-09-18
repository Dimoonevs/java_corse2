package lambda;

public class Test2 {
    static void def(I i){
        System.out.println(i.abc("Hello"));
    }

    public static void main(String[] args) {
        Test2.def((String str) -> {return str.length();});
    }
}
interface I {
    int abc(String s);
}

