package lesson05;

public class Homework4_solution {
    public static void main(String[] args) {
        printCharIndex("abcdabcdabc", 'b');
        printCharIndex("abcdabcdabc", '1');
        printCharIndex(null, 'c');
        printCharIndex("", 'c');
        System.out.println("===========================");
        System.out.println(isPalindrome("natan"));
        System.out.println(isPalindrome("Natan"));
        System.out.println(isPalindrome(" Natan  "));
        System.out.println(isPalindrome(" Nat  tan  "));
        System.out.println("===========================");
        System.out.println(substringIndex("123456 123 456", "345"));
        System.out.println(substringIndex("123456 123 456", "3451"));
        System.out.println(substringIndex("123456 123 456", null));
        System.out.println(substringIndex("123456 123 456", "    "));
    }

    public static Integer substringIndex(String str, String sub) {
        if (str == null || sub == null || str.isBlank() || sub.isBlank()
                || str.length() < sub.length()) {
            System.out.println("smth went wrong");
            return null;
        }
        return str.indexOf(sub);
    }

    static Boolean isPalindrome(String str) {     //abcddbca
        if (str == null || str.isEmpty()) {
            System.out.println("Str is null or empty");
            return null;
        }
        str = str.trim();
        str = str.toLowerCase();
        for (int i = 0, j = str.length() - 1; i < j; i++, j--) {
            char ci = str.charAt(i);  //ci  str[0]
            char cj = str.charAt(j);  //cj  str[length-1]
            System.out.println(ci + ":" + cj);
            if (ci != cj)
                return false;
        }
        return true;
    }

    public static void printCharIndex(String str, char sym) {
        if (str == null || str.isEmpty()) {
            System.out.println("Str is null or empty");
            return;
        }
        boolean flag = false;
        for (int i = 0; i < str.length(); i++) {  //abcda  charAt(0) = a  if a==a print index
            if (str.charAt(i) == sym) {    //str --> symbol == sym
                System.out.print(i + " ");
                flag = true;
            }
        }
        if (!flag)    //flag == false
            System.out.println("not found");
        else
            System.out.println();
    }
}

