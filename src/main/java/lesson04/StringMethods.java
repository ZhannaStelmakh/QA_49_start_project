package lesson04;

public class StringMethods {
    public static void main(String[] args) {
        String str1 = "My string";
        String str2 = new String("Hello world");
        char[] chars = {'a', 'b', 'c'};
        String str3 = new String(chars);

        String str4 = "hello";
        String str5 = "hello";
        System.out.println(str4 == str5);

        String str6 = new String("hello");
        String str7 = new String("hello");
        System.out.println(str6 == str7);
        System.out.println("==================================");
        String str8 = new String("My string");
        System.out.println(str1.equals(str8));
        String str9 = new String("my STring r");
        System.out.println(str1.equalsIgnoreCase(str9));
        System.out.println("==================================");
        System.out.println(str8.length());
        String strNull = null;
        //System.out.println(strNull.length()); wrong
        String strEmpty = "";
        System.out.println(strEmpty.length());
        System.out.println("==================================");
        System.out.println(strEmpty.isEmpty());  // true if ""
        System.out.println(strEmpty.isBlank()); //true if "" or "    "
        System.out.println("==================================");
        System.out.println(str9);
        System.out.println(str9.charAt(5)); //return char
        System.out.println(str9.indexOf('r')); // return first index
        System.out.println(str9.indexOf("rin")); // return first index
        System.out.println(str9.indexOf("Sveta")); // return -1
        System.out.println(str9.indexOf('r', 6));
        System.out.println(str9.indexOf('r', 26));
        System.out.println("==================================");
        String str10 = "Hello my friend";
        System.out.println(str10.toLowerCase());
        System.out.println(str10.toUpperCase());
        System.out.println(str10);
        str10 = str10.toUpperCase();
        System.out.println(str10);
        System.out.println("==================================");
        String str11 = "  Qwerty 123 ";
        System.out.println(str11.trim()); // "Qwerty 123"

    }
}
