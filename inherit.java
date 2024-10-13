class parent {
    void display_P() {
        System.out.println("inside parent class...");
    }
}

class child extends parent {
    void display_C() {
        System.out.println("inside child class...");
    }
}

class Grandchild extends child {
    void display_G() {
        System.out.println("MULTILEVEL INHERITANCE...");
    }
}

public class inherit {
    public static void main(String[] args) {
    Grandchild obj = new Grandchild();
    obj.display_P();
    obj.display_C();
    obj.display_G();
}
}
