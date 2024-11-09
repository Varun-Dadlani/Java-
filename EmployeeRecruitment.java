import java.util.Scanner;
class TooOlderException extends Exception {
    public TooOlderException(String message) {
        super(message);
    }
}

class TooYoungerException extends Exception {
    public TooYoungerException(String message) {
        super(message);
    }
}

public class EmployeeRecruitment {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String name = "John Doe";
        int age = sc.nextInt();
        try {
            if(age<20){
                throw new TooYoungerException("Too Young");
            }
            else if(age>45){
                throw new TooOlderException("too old");
            }
            else{
                System.out.println("Eligible");
            }
        } catch (TooOlderException | TooYoungerException e) {
            System.out.println(e.getMessage());
        }
    }
}
