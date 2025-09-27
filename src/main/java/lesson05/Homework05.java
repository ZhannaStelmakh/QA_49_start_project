package lesson05;

public class Homework05 {
    public static void main(String[] args) {
        System.out.println("------------1-----------");
        StringBuilder reversed = new StringBuilder("12345").reverse();
        System.out.println(reversed);

        printReverse("12345");
        printReverse("");
        printReverse(null);
        System.out.println("-----------2-----------");

        String str1 = "to be or not to be";
        String str2 = "hello world";
        String str3 = null;
        String str4 = "";

        System.out.println("Original: '" + str1 + "' --> Reversed: '" + returnStringReverse(str1) + "'");
        System.out.println("Original: '" + str2 + "' --> Reversed: '" + returnStringReverse(str2) + "'");
        System.out.println("Original: null --> Reversed: '" + returnStringReverse(str3) + "'");
        System.out.println("Original: '" + str4 + "' --> Reversed: '" + returnStringReverse(str4) + "'");

    }


    public static String returnStringReverse(String str) {
        if (str == null || str.isEmpty()) {
            return "Invalid input";
        }
        return new StringBuilder(str).reverse().toString();
    }

    static void printReverse(String str) {
        if (str == null) {
            System.out.println("string is null.");
            return;
        }

        if (str.isEmpty()) {
            System.out.println("string is empty.");
            return;
        }

    }
}


