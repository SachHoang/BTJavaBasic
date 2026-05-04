import java.util.Scanner;

public class SumEvenNumbers {
    public static int sumEvenNumbers(int n) {
        if (n < 0) return 0;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            if (i % 2 == 0) sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số nguyên dương n: ");
        int n = scanner.nextInt();
        int result = sumEvenNumbers(n);
        System.out.println("Tổng các số chẵn từ 0 đến " + n + " là: " + result);
        scanner.close();
    }
}