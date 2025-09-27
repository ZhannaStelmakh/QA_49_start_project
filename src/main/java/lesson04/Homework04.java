package lesson04;

public class Homework04 {
    public static void main(String[] args) {
        System.out.println("------------1------------");
 /*       Create methods with checks(!!!) in the class HomeWork4 with method main(),
        after do all checking
        1.
        public static void printCharIndex(String str, char sym)
        012345678910
        str = "hello world" sym = 'l'
        output:
        2 3 9

  */
        String str1 = new String("hello world");
        String str2 = new String("");
        String strNull = null;

        printCharIndex("hello world", 'l');
        printCharIndex(str2, 'a');
        printCharIndex(strNull, 'a');

        System.out.println("------------2------------");
//        Boolean isPalindrome(String str)   dovod  - true  dovod1 - false

        // Test cases
        System.out.println("Is 'dovod' a palindrome? " + isPalindrome("dovod"));   // true
        System.out.println("Is 'dovod1' a palindrome? " + isPalindrome("dovod1")); // false
        System.out.println("Is 'dohod' a palindrome? " + isPalindrome("madam"));   // true
        System.out.println("Is 'thanks' a palindrome? " + isPalindrome("hello"));   // false
    }

    public static Boolean isPalindrome(String str) {
        if (str == null) {
            System.out.println("String is null !!!");
            return false;
        }

        if (str.isEmpty()) {
            System.out.println("String is empty !!!");
            return false;
        }

        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            // Check characters at current positions
            if (str.charAt(left) != str.charAt(right)) {
                System.out.println("Mismatch at index " + left + " and " + right + " !!!"+
                        " (" + str.charAt(left) + " != " + str.charAt(right) + ")");
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void printCharIndex(String str, char sym) {

        if (str == null) {
            System.out.println("String is null.");
            return;
        }

        if (str.isEmpty()) {
            System.out.println("String is empty.");
            return;
        }

        boolean found = false;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == sym) {
                System.out.print(i + " ");
                found = true;
            }
        }
    }
}

