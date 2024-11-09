public class NegativeIndex {
    public static void main(String[] args) {
        try {
            int[] arr = new int[-5];  // This will generate NegativeArraySizeException
        } catch (NegativeArraySizeException e) {
            System.out.println(e);
        }

        try {
            int result = 10 / 0;  // This will generate ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
