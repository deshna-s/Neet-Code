import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input for number of elements
        System.out.print("Enter your name: ");
        String str = input.next();

        if (isPalindrome(str, 0, str.length() - 1)) {
            System.out.println(str + " is palindrome");
        } else {
            System.out.println(str + " is not a palindrome");
        }

        input.close();

    }

    public static boolean isPalindrome(String str, int l, int r) {
        // Base case: if the string has one or zero characters, it's a palindrome
        if (l >= r) {
            return true;
        }
        if (str.charAt(l) != str.charAt(r)) {
            return false;
        }
        // Recursive call to check the next substring
        return isPalindrome(str, l + 1, r - 1);

    }

}
