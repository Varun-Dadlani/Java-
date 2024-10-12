class Example {
    Example(String x) {
        System.out.println("constructor with value:" + x);
    }

    Example(int x) {
        System.out.println("Parameterized constructor with value: " + x);
    }
}
public class constructor_overloading{
    public static void main(String[] args) {
        Example obj1 = new Example("assignment");
        Example obj2 = new Example(10);
    }
}
