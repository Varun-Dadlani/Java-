import java.util.Scanner;

class NegativeAgeException extends Exception {
    public NegativeAgeException(String message) {
        super(message);
    }
}

public class Person  {
    String name;
    int age;
    public static void main(String[] args) {
        String name;
        int age;
        Scanner sc=new Scanner(System.in);
        name=sc.next();
        age =sc.nextInt();
        try {
            if(age<0){
                throw new NegativeAgeException("Age cannot be negative");
            }
            else{
                System.out.println("eligible");

            }
        } catch (NegativeAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
