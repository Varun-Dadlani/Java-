import java.util.Scanner;

public class TemperatureConversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to convert Celsius to Fahrenheit, 2 for Fahrenheit to Celsius:");
        int choice = sc.nextInt();
        System.out.println("Enter the temperature:");
        double temp = sc.nextDouble();

        if (choice == 1) {
            double fahrenheit = (temp * 9/5) + 32;
            System.out.println("Temperature in Fahrenheit: " + fahrenheit);
        } else if (choice == 2) {
            double celsius = (temp - 32) * 5/9;
            System.out.println("Temperature in Celsius: " + celsius);
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
