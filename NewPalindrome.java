import java.util.Scanner;

public class NewPalindrome {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Input for number of elements
        System.out.print("Enter your name: ");
        String str = input.next();

        if (isPalindrome(0, str)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        input.close();
    }

    public static boolean isPalindrome(int i, String s) {
        if (i >= s.length() / 2) {
            return true;
        }
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
            return false;
        }
        return isPalindrome(i + 1, s);
    }
}
