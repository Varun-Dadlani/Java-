class Parent {
    void display() {
        System.out.println("Parent class method");
    }
}

class Child extends Parent {
    @Override
    void display() {
        System.out.println("Child class method");
    }
}

public class Method2{
    public static void main(String[] args) {
        Parent obj = new Child();
        obj.display();
    }
}
