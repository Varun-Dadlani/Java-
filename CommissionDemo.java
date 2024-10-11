import java.util.Scanner;

// Commission class with an instance variable 'sales'
class Commission {
    double sales;

    // Constructor to initialize sales
    public Commission(double sales) {
        if (sales < 0) {
            throw new IllegalArgumentException("Sales cannot be negative.");
        }
        this.sales = sales;
    }

    // Method to calculate commission
    public double calculateCommission() {
        return sales * 0.10;  // 10% commission
    }
}

// Demo class to test Commission class
public class CommissionDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter sales amount:");
        double sales = sc.nextDouble();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commission = new Commission(sales);
            double result = commission.calculateCommission();
            System.out.println("Commission: " + result);
        }
    }
}
