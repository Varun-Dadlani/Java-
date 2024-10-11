
public class MedianFinder {
    public static void main(String[] args) {
        
        int[] arr = {2,3,5,8,9,10,11,12};
        int n=arr.length;
        double median;
        if (n % 2 == 0) {
            median = (arr[(n/2 )- 1] + arr[n/2]) / 2.0;
        } 
        else {
            median = arr[n/2];
        }
        System.out.println("Median is: " + median);
    }
}
