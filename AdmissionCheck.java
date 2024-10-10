import java.util.Scanner;

public class AdmissionCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in Mathematics, Physics, and Chemistry:");
        int math = sc.nextInt();
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();

        if ((math >= 60 && physics >= 50 && chemistry >= 40) && 
            (math + physics + chemistry >= 200 || math + physics >= 150)) {
            System.out.println("Eligible for admission.");
        } else {
            System.out.println("Not eligible for admission.");
        }
    }
}
