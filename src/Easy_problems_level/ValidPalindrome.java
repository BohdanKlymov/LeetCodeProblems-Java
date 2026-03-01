package Easy_problems_level;
import java.util.Scanner;

//  A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
//  removing all non-alphanumeric characters, it reads the same forward and backward.
//  Alphanumeric characters include letters and numbers.
//  Return true if it is a palindrome, or false otherwise.

public class ValidPalindrome {
    static void main (String[] args) {

        String s = getString();
        s = s.toLowerCase();

        String convertedText = letNumbersAndLetters(s);

        String reversedText = reverseText(convertedText);

        System.out.println(palindromeVerification(convertedText, reversedText));
    }

    public static String getString() {
        //        example for palindrome phrase:
        //        A man, a plan, a canal: Panama

        System.out.print("Please print a text: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        return s;
    }

    public static String letNumbersAndLetters(String s) {

        StringBuilder convertedText = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);

            if (Character.isLetterOrDigit(currentChar)) {
                convertedText.append(currentChar);
            }
        }

        return convertedText.toString();
    }

    public static String reverseText(String convertedText) {
        StringBuilder sb = new StringBuilder();

        for (int i = convertedText.length() - 1; i >= 0; i--) {
            sb.append(convertedText.charAt(i));
        }

        return sb.toString();
    }

    public static Boolean palindromeVerification(String convertedText, String reversedText) {
        return convertedText.equals(reversedText);
    }
}
