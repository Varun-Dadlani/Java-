class Parent {
    static void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    static void display() {
        System.out.println("Child class method");
    }
}

public class Hiding{
    public static void main(String[] args) {
        Parent obj = new Parent();
        obj.display(); // Calls Parent class method

        Child obj2 = new Child();
        obj2.display(); // Calls Child class method
    }
}
