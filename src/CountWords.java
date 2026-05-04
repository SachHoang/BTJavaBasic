import java.util.Scanner;

public class CountWords {
    public static int countWords(String str) {
        if (str == null || str.trim().isEmpty()) return 0;
        String trimmed = str.trim();
        int count = 0;
        boolean isWord = false;
        for (int i = 0; i < trimmed.length(); i++) {
            if (trimmed.charAt(i) != ' ') {
                if (!isWord) {
                    count++;
                    isWord = true;
                }
            } else {
                isWord = false;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        int result = countWords(input);
        System.out.println("Số từ trong chuỗi: " + result);
        scanner.close();
    }
}