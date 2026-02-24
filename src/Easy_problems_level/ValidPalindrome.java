package Easy_problems_level;
import java.util.Scanner;

public class ValidPalindrome {
    public static void main (String[] args) {

        String s = getString();

        System.out.println(s);

    }

    public static String getString() {
        //        example for texts:
        //        A man, a plan, a canal: Panama
        //        race a car

        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        return s;
    }
}
