// Three interfaces, each with two methods
interface Interface1 {
    void method1A();
    void method1B();
}

interface Interface2 {
    void method2A();
    void method2B();
}

interface Interface3 {
    void method3A();
    void method3B();
}

interface NewInterface extends Interface1, Interface2, Interface3 {
    void newMethod();
}


class ConcreteClass {
    void concreteMethod() {
        System.out.println("This is a method from ConcreteClass.");
    }
}

class MyClass extends ConcreteClass implements NewInterface {

    // Implementing methods from Interface1
    @Override
    public void method1A() {
        System.out.println("Implementation of method1A");
    }

    @Override
    public void method1B() {
        System.out.println("Implementation of method1B");
    }

    @Override
    public void method2A() {
        System.out.println("Implementation of method2A");
    }

    @Override
    public void method2B() {
        System.out.println("Implementation of method2B");
    }
    @Override
    public void method3A() {
        System.out.println("Implementation of method3A");
    }

    @Override
    public void method3B() {
        System.out.println("Implementation of method3B");
    }
    public void newMethod() {
        System.out.println("Implementation of newMethod");
    }
}

public class Interfaces {
    public static void useInterface1(Interface1 obj) {
        obj.method1A();
        obj.method1B();
    }
    public static void useInterface2(Interface2 obj) {
        obj.method2A();
        obj.method2B();
    }
    public static void useInterface3(Interface3 obj) {
        obj.method3A();
        obj.method3B();
    }
    public static void useNewInterface(NewInterface obj) {
        obj.newMethod();
    }

    public static void main(String[] args) {
        
        MyClass obj = new MyClass();
        useInterface1(obj);
        useInterface2(obj);
        useInterface3(obj);
        useNewInterface(obj);

    }
}
