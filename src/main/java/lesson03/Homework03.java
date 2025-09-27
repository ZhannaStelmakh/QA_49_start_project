package lesson03;

public class Homework03 {
    public static void main(String[] args) {
        System.out.println("-------------1-------------");
        boolean[] array = {true, false, true, true, false};
        arraySum(array);
        boolean bool = Boolean.FALSE;
        System.out.println(arraySum(array));
        System.out.println("-------------2-------------");
        int[] array1 = {1, 4, 6, 7, 9};
        System.out.println(" array1--->result:" + isIncreaseArray(array1));
        int[] array2 = {1, 4, 6, 3, 9};
        System.out.println("array2--->result:" + isIncreaseArray(array2));
        System.out.println("-------------3-------------");
        int[] array3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int el = 0;
        int[] result = changeOddElement(array3, el);
        for (int num : result)
            System.out.print(num + " ");
        System.out.println("------------4------------");


    }

    private static int[] changeOddElement(int[] array3, int el) {
        if (array3 == null || array3.length == 0) {
            System.out.println("ERROR: the array is invalid");
            return null;
        }

        for (int i = 0; i < array3.length; i++) {
            if (array3[i] % 2 != 0)
                array3[i] = el;
        }
        return array3;
    }

    private static Boolean isIncreaseArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("ERROR: the array is invalid");
            return null;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] >= array[i + 1])
                return false;
        }
        return true;

    }

    private static Byte arraySum(boolean[] array) {
        if (array == null || array.length == 0) {
            System.out.println("invalid array");
            return null;
        }
        byte sum = 0;
        for (boolean element : array) {
            if (element == true)
                sum++;
        }
        return sum;
    }

}

