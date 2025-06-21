import java.util.Scanner;

public class ToggleCaseOfCharacters {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String toggledString = toggleCase(inputString);
        System.out.println("Toggled string: " + toggledString);

        scanner.close();
    }

    public static String toggleCase(String str) {
        char[] chars = str.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char ch = chars[i];
            if (ch >= 'a' && ch <= 'z') {
                chars[i] = (char) (ch - 32);
            } else if (ch >= 'A' && ch <= 'Z') {
                chars[i] = (char) (ch + 32);
            }
        }
        return new String(chars);
    }
}