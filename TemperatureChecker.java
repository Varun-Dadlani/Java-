import java.util.Scanner;
class TooHotException extends Exception {
    public TooHotException(String message) {
        super(message);
    }
}

class TooColdException extends Exception {
    public TooColdException(String message) {
        super(message);
    }
}

public class TemperatureChecker {


    public static void main(String[] args) {
        int temperature;
        Scanner sc=new Scanner(System.in);
        temperature=sc.nextInt();

        try {
            if (temperature > 35) {
                throw new TooHotException("Temperature is too hot!");
            } else if (temperature < 5) {
                throw new TooColdException("Temperature is too cold!");
            } else {
                System.out.println("Normal temperature. In Fahrenheit: " + (temperature * 9 / 5 + 32));
            }

        } catch (TooHotException | TooColdException e) {
            System.out.println(e.getMessage());
        }
    }
}
