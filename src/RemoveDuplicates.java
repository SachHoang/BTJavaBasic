import java.util.Scanner;

public class RemoveDuplicates {
    public static String removeDuplicates(String str) {
        if (str == null || str.length() <= 1) return str;
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            boolean found = false;
            for (int j = 0; j < result.length(); j++) {
                if (result.charAt(j) == c) {
                    found = true;
                    break;
                }
            }
            if (!found) result.append(c);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        String output = removeDuplicates(input);
        System.out.println("Chuỗi sau khi xóa ký tự lặp: " + output);
        scanner.close();
    }
}