import java.util.Scanner;

public class MaxofThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a>=b && a>=c){
            System.out.println(a+" is the greatest amongst the three");
        }
        else if (b>=a && b>=c){
            System.out.println(b+" is the greatest amongst the three");
        }
         else{
            System.out.println(c+" is the greatest amongst the three");
        }
    }
}
