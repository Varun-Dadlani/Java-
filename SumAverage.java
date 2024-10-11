public class SumAverage {
    public static void main(String[] args) {
        int[] arr ={4,7,1,2,3,3,4,6,8,12,24,5,2};
        int sum = 0;
        int n=arr.length;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        double average = (double) sum / n;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
