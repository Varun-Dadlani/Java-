class Num {
    int number;

    Num(int number) {
        this.number = number;
    }

    void shownum() {
        System.out.println("Number: " + number);
    }
}

class HexNum extends Num {

    HexNum(int number) {
        super(number);
    }

    @Override
    void shownum() {
        System.out.println("Hexadecimal: " + Integer.toHexString(number));
        System.out.println("Octal: " + Integer.toOctalString(number));
    }
}

public class Conversion {
    public static void main(String[] args) {
        Num n = new Num(255);
        n.shownum();

        HexNum hex = new HexNum(255);
        hex.shownum();
    }
}
