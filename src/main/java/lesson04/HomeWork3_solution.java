package lesson04;

import java.util.Arrays;

public class HomeWork3_solution {
    public static void main(String[] args) {
        int[] arrayInt1 = {1, 3, 5, 2, 3, 6, 4};
        System.out.println(Arrays.toString(arrayInt1));
        boolean[] boolArray = {true, false, false, true, true};
        System.out.println(arraySum(boolArray));
        System.out.println(arraySum(null));
        System.out.println(arraySum(new boolean[]{}));
        System.out.println("=======================================");
        System.out.println(isIncreaseArray(arrayInt1));
        System.out.println(isIncreaseArray(new int[]{1, 2, 3, 4}));
        System.out.println(isIncreaseArray(new int[]{1, 2, 3, 3, 4}));
        //int[] ar1 = new int[]{1,2,3,4};
        System.out.println("=========================================");
        System.out.println(Arrays.toString(changeOddElement(arrayInt1, 100)));
        //changeOddElement(arrayInt1, 100) --> int[]{} --> string [100, 2,100]
        int[] resultArray = changeOddElement(arrayInt1, 25);
        System.out.println(Arrays.toString(resultArray));
        System.out.println("=========================================");
        int[] temp = {-1, 1, -5, 5, 6, -10};
        System.out.println(Arrays.toString(returnMinTemperatureAndIndex(temp)));
    }
    public static int[] returnMinTemperatureAndIndex(int[] degrees) {
        if (degrees == null || degrees.length == 0) {
            System.out.println("array is null or empty");
            return null;
        }
        int minTemp = degrees[0];
        int minIndex = 0;
        for (int i = 1; i < degrees.length; i++) {
            if (degrees[i] < minTemp) {
                minTemp = degrees[i];
                minIndex = i;
            }
        }
        return new int[]{minTemp, minIndex};
    }

    static int[] changeOddElement(int[] array, int el) {
        if (array == null || array.length == 0) {
            System.out.println("array is null or empty");
            return null;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = el;
            }
        }
        return array;
    }

    static Boolean isIncreaseArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("array is null or empty");
            return null;
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1])
                return false;
        }
        return true;
    }

    static Byte arraySum(boolean[] array) {
        if (array == null || array.length == 0) {
            System.out.println("array is null or empty");
            return null;
        }
        byte sum = 0;
        for (boolean b : array) {
            if (b)    //equals  b == true
                sum++;
        }
        return sum;
    }
}
