package Easy_problems_level;
import java.util.Scanner;
import java.util.ArrayList;

//  A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and
//  removing all non-alphanumeric characters, it reads the same forward and backward.
//  Alphanumeric characters include letters and numbers.

public class ValidPalindrome {
    public static void main (String[] args) {

        String s = getString();
        s = s.toLowerCase();

        String convertedText = letNumbersAndLetters(s);

        palindromeVerification(convertedText);

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

        String conventedText = "";

        for (int i = 0; i < s.length(); i++) {

            char currentChar = s.charAt(i);

            if (Character.isDigit(currentChar) || Character.isLetter(currentChar)) {
                conventedText += currentChar;
            }
        }
        return conventedText;
    }

    public static Boolean palindromeVerification(String convertedText) {

    }

}
