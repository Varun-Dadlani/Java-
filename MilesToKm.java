import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter distance in miles:");
        double m = sc.nextDouble();

        double k = m * 1.60934;
        System.out.println("Distance in kilometers: " + k);
    }
}
