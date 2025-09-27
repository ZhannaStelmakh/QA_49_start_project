package lesson02;

public class Homework02 {
    public static void main(String[] args) {
        System.out.println("-----------1----------");
        int[] ar = new int[]{9, 2, 5, 11, 7, 3};
        System.out.println(maxValue(ar));
        System.out.println("-----------2----------");
        char[] arr = new char[]{'t', 'n', 'b', 'c', 'a', 'g', 'd'};
        System.out.println(minValue(arr));
        System.out.println("-----------3----------");
        int[] arr1 = new int[]{9, 2, 5, 4, 7, 8};
        System.out.println(evensSum(arr1));


    }

    public static int maxValue(int[] ar) {
        if (ar == null) {
            System.out.println("array is null");
        } else if (ar.length == 0) {
            System.out.println("array is empty");
        }
        int maxValue = ar[0];
        for (int i = 0; i < ar.length; i++) {
            if (ar[i] > maxValue)
                maxValue = ar[i];
        }
        return maxValue;

    }

    public static char minValue(char[] arr) {
        if (arr == null) {
            System.out.println("array is null");
        } else if (arr.length == 0) {
            System.out.println("array is empty");
        }
        char minValue = arr[0];
        for (int i = 0; i < arr.length; i++) {
            char c = (char) i;
            if (arr[i] < minValue)
                minValue = arr[i];
        }
        return minValue;
    }

    public static int evensSum(int[] arr1) {
        int sum = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] > 0 && arr1[i] % 2 == 0) {
                sum += arr1[i];
                }
        }
        return sum;
    }
}





