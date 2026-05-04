import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(String str) {
        if (str == null || str.length() <= 1) return true;
        int left = 0, right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi cần kiểm tra: ");
        String input = scanner.nextLine();
        boolean result = isPalindrome(input);
        System.out.println("Chuỗi đối xứng? " + result);
        scanner.close();
    }
}