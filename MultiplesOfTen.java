import java.util.Scanner;

public class MultiplesOfTen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the starting and ending interval:");
        int start = sc.nextInt();
        int end = sc.nextInt();

        System.out.println("Multiples of 10 between " + start + " and " + end + ":");
        for (int i = start; i <= end; i++) {
            if (i % 10 == 0) {
                System.out.println(i);
            }
        }
    }
}
