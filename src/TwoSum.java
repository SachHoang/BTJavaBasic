import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (sum == target) {
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;
            } else {
                right--;
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số lượng phần tử của mảng: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("Nhập các phần tử của mảng (đã sắp xếp tăng dần):");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextInt();
        }
        System.out.print("Nhập target: ");
        int target = scanner.nextInt();
        int[] result = twoSum(numbers, target);
        System.out.println("Chỉ số (bắt đầu từ 1): " + Arrays.toString(result));
        scanner.close();
    }
}