import java.util.Scanner;

public class FirstLetters {
    public static String getFirstLetters(String str) {
        if (str == null || str.isEmpty()) return "";
        StringBuilder result = new StringBuilder();
        boolean isNewWord = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c != ' ') {
                if (isNewWord) {
                    if (result.length() > 0) result.append(" ");
                    result.append(c);
                    isNewWord = false;
                }
            } else {
                isNewWord = true;
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = scanner.nextLine();
        String result = getFirstLetters(input);
        System.out.println("Các chữ cái đầu: " + result);
        scanner.close();
    }
}