package lesson05;

import java.util.Arrays;

import static lesson05.Homework4_solution.*;  //all static methods

public class StringMethods1 {
    public static void main(String[] args) {
        String str1 = "To be or not be";
        String[] arrayStr = str1.split(" ");
        System.out.println(Arrays.toString(arrayStr));
        System.out.println("=====================");
        System.out.println(quantityPalindrom("To be or natan not dovoD be"));
        System.out.println("=====================");
        String str2 = "123 333 444 2";
        String[] array = str2.split(" ");
        System.out.println(Arrays.toString(array));
        String[] array1 = str2.split("333", 3);
        System.out.println(Arrays.toString(array1));
        System.out.println("=====================");
        String str3 = "1234567890123";
        System.out.println(str3.substring(3));
        System.out.println(str3.substring(3,5));
        System.out.println("=====================");
        System.out.println(str3.replace('2','!'));
        System.out.println(str3.replaceAll("23", "AAA"));
        System.out.println("=====================");
        System.out.println(String.join(": ", "my","name","is","Vasia"));
        System.out.println("============================");
        String str4 = "abcdif";
        String str5 = "bcd";
        String str6 = "abcdif";
        System.out.println(str4.contains(str5));
        System.out.println(str4.contains(str6));
        System.out.println("============================");
        System.out.println(str4.endsWith("if"));
        System.out.println(str4.startsWith("abc"));
    }

    public static Integer quantityPalindrom(String text) {
        if (text == null || text.isBlank()) {
            System.out.println("text is blank or empty");
            return null;
        }
        //"To be or natan not be"
        String[] array = text.split(" ");
        int quantity = 0;
        for (String str : array) {
//            if(Homework4_solution.isPalindrome(str))
//                quantity++;
            if (isPalindrome(str))
                quantity++;
        }
        return quantity;
    }
}
