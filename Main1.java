class ABC{
    ABC(int x){
      System.out.println("paramiterized constructor called");
      System.out.println("Argument passed :" + x);

    }
}

public class Main1{
    public static void main(String[] args){
        ABC ob1=new ABC(10);
    }
}