package generics;

public class ParameterizedClass2 {
    public static void main(String[] args) {
        Pair<String, Integer> pair = new Pair<>("Dima", 12);
        System.out.println(pair);

        Pair<Car1, Persons> pair1 = new Pair<>(new Car1("BMW"), new Persons("Dima"));

        System.out.println("Сar owner: " + pair1.getValue2().getName() +
                "\nName car: " + pair1.getValue1().getName());

        OtherPair<String> otherPair = new OtherPair<>("Dima", "BMW");
    }
}
class Pair <V1,V2>{
    private V1 value1;
    private V2 value2;

    public Pair(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    public String toString(){
        return "Value1 = {"+ value1+ "}" +
                "\nValue2 = {"+value2+"}";
    }

    public V1 getValue1() {
        return value1;
    }

    public void setValue1(V1 value1) {
        this.value1 = value1;
    }

    public V2 getValue2() {
        return value2;
    }

    public void setValue2(V2 value2) {
        this.value2 = value2;
    }
}
class Car1{
    private String name;

    public Car1(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Persons{
    private String name;

    public Persons(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class OtherPair <V>{
    private V value1;
    private V value2;

    public OtherPair(V value1, V value2) {
        this.value1 = value1;
        this.value2 = value2;
    }


    public String toString(){
        return "Value1 = {"+ value1+ "}" +
                "\nValue2 = {"+value2+"}";
    }

    public V getValue1() {
        return value1;
    }

    public void setValue1(V value1) {
        this.value1 = value1;
    }

    public V getValue2() {
        return value2;
    }

    public void setValue2(V value2) {
        this.value2 = value2;
    }
}

