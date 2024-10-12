public class AlternateNumbers {
    public static void main(String[] args) {
        int[] arr = {1,2,4,6,3,1,3,6,8,9};
        int n =arr.length;
        System.out.println("Alternate numbers in the array:");
        for (int i = 0; i < n; i += 2) {
            System.out.println(arr[i]);
        }
    }
}
