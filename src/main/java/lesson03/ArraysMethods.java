package lesson03;

public class ArraysMethods {
    public static void main(String[] args) {
        char[] array = {'a', 'b', 'v', '1'};
        char[] array1 = {'a', 'b', 'v', 'b'};
        System.out.println(isArrayContainsOnlyEnglishLetters(array));
        System.out.println(isArrayContainsOnlyEnglishLetters(array1));
        char[] array2 = {'a', 'z', 'A', 'Z'};
        System.out.println(isArrayContainsOnlyEnglishLetters(array2));
        char[] array3 = {64, 91, 96, 123};
        System.out.println(isArrayContainsOnlyEnglishLetters(array3));
    }

    //65 - 90   97 - 122
    private static Boolean isArrayContainsOnlyEnglishLetters(char[] array) {
        if (array == null || array.length == 0) {
            System.out.println("invalid array");
            return null;
        }
        for (char ch : array) {
            if (ch < 65 || ch > 122 || (ch >90 && ch < 97))
                return false;
        }
        return true;
    }
}
