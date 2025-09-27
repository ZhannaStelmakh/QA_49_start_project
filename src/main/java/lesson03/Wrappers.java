package lesson03;

public class Wrappers {
    public static void main(String[] args) {
        Byte b1 = 10;
        Short sh1 = 123;
        Integer i1 = 12345;
        Long l1 = 99999999999L;
        Float f1 = 123.123f;
        Double d1 = 44.55;
        Boolean bool1 = false;
        Character ch1 = 'A';

        int i2 = 33;
        Integer i3 = i2;
        int i4 = i3;

        //Integer i5 = new Integer(456); depricated
        Integer i5 = 456;
        System.out.println(minPositiveValue(null));

        Short sh2 = 456;
        System.out.println(i5.equals(sh2));  //integer   short
        System.out.println(i5.equals(sh2.intValue())); //integer    short-->integer

        int maxValue = Integer.MAX_VALUE;
        int minValue = Integer.MIN_VALUE;
        long maxLong = Long.MAX_VALUE;
        boolean bool2 = Boolean.FALSE;

        Integer i7 = 333;
        String str1 = i7.toString() + i7.toString();
        System.out.println(str1);
        String str2 = "678";
        int result = Integer.valueOf(str2)*2;
        System.out.println(result);

        Long l3 = i7.longValue();
        System.out.println(l3+" "+l3.getClass());

        Float f4 = i7.floatValue();
        System.out.println(f4+" "+f4.getClass());
        //result = Integer.valueOf("aaaa");

        System.out.println("=================================");
        Character ch3 = 'a';
        System.out.println(Character.isDigit(ch3));
        System.out.println(Character.isDigit('1'));
        System.out.println(Character.isLetter('f'));
        System.out.println(Character.isLowerCase('A'));
        System.out.println(Character.isUpperCase('G'));
        System.out.println(Character.isSpaceChar(' '));
    }

    public static Integer minPositiveValue(int[] array){
        if (array == null || array.length == 0) {
            System.out.println("invalid array");
            return null;
        }
        int min = Integer.MAX_VALUE;  //-11  12   1
        for (int element : array){
            if(element > 0 && element < min)
                min = element;
        }
        return min;
    }
}
