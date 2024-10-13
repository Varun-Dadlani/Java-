public class Sum{
    static int consum(int num){
        int sum=0;
        int curr=-1;
        while(num>0){
            int l=num%10;
            if (curr!=-1){
                curr=l*10 + curr;
                sum+=curr;
            }
            curr=l;
            num=num/10;
        }
        return sum;
    }
    
    public static void main(String args[]){
        int x=5002;
        System.out.println(consum(x));
    }

}