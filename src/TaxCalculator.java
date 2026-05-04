import java.util.Scanner;

public class TaxCalculator {
    public static double calculateTax(double annualIncome) {
        double tax = 0;
        double remaining = annualIncome;
        if (remaining > 0) {
            double tier1 = Math.min(remaining, 5);
            tax += tier1 * 0.05;
            remaining -= tier1;
        }
        if (remaining > 0) {
            double tier2 = Math.min(remaining, 5);
            tax += tier2 * 0.10;
            remaining -= tier2;
        }
        if (remaining > 0) {
            double tier3 = Math.min(remaining, 8);
            tax += tier3 * 0.15;
            remaining -= tier3;
        }
        if (remaining > 0) {
            double tier4 = Math.min(remaining, 14);
            tax += tier4 * 0.20;
            remaining -= tier4;
        }
        if (remaining > 0) {
            double tier5 = Math.min(remaining, 20);
            tax += tier5 * 0.25;
            remaining -= tier5;
        }
        if (remaining > 0) {
            double tier6 = Math.min(remaining, 28);
            tax += tier6 * 0.30;
            remaining -= tier6;
        }
        if (remaining > 0) {
            tax += remaining * 0.35;
        }
        return tax;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập thu nhập hàng năm (triệu đồng): ");
        double income = scanner.nextDouble();
        double tax = calculateTax(income);
        System.out.printf("Thuế phải trả: %.2f triệu đồng%n", tax);
        scanner.close();
    }
}