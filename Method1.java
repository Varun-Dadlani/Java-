class Example {
    void display(int a) {
        System.out.println("Integer value: " + a);
    }

    void display(double a) {
        System.out.println("Double value: " + a);
    }
}
public class Method1{
    public static void main(String[] args) {
        Example obj = new Example();
        obj.display(5);
        obj.display(5.5);
    }
}
