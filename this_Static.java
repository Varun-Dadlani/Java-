class Base{
    static int count = 0;
    String str;
    Base(String str){
        this.str=str;
        count++;
    }
    void display(){
        System.out.println("entered string :" + str);
        System.out.println("no of instancens :" + count);
    }
}

public class this_Static{
    public static void main(String args[]){
        Base obj= new Base("Keywords");
        obj.display();
    }
}