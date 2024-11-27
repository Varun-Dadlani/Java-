import java.util.Scanner;

class username extends Exception {
    public username(String message){
        super(message);
    }
}

class password extends Exception {
    public password(String message){
        super(message);
    }
}

public class User {
  public static void main(String[] args) {
    String name,code;
    Scanner sc=new Scanner(System.in);
    name=sc.nextLine();
    code=sc.nextLine();
    System.out.println(name +" "+code);
    try{
        if(name.length()<6){
            throw new username("username less than 6 chacarters");
        }
        else if(!code.equals("java")){
            throw new password("incorrect password");
        }
        else{
            System.out.println("login successfull");
        }

    }
    catch(username | password e){
         System.out.println(e.getMessage());
    }
  }
    
}