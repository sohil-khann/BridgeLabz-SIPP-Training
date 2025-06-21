import java.util.Scanner;

public class RemoveSpecificCharacter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        System.out.print("Enter the character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        String modifiedString = removeChar(str, charToRemove);
        System.out.println("Modified String: " + modifiedString);

        scanner.close();
    }

    public static String removeChar(String str, char charToRemove) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }
}