package generics;

public class ParameterizedClass {
    public static void main(String[] args) {
        Info<String> info1 = new Info<>("Dima");
        System.out.println(info1);

        Info<Integer> info2 = new Info<>(18);
        System.out.println(info2);

        info1.setValue("Anton");
        info2.setValue(12);

        System.out.println(info1.getValue());
        System.out.println(info2.getValue());
    }

}
class Info <T>{

    private T value; // not to be static

    public Info(T value) {
        this.value = value;
    }

    @Override
    public String toString(){
        return "Value = {[" + value + "]}";
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
