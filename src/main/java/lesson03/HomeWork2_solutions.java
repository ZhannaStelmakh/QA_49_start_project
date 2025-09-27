package lesson03;

public class HomeWork2_solutions {
    public static void main(String[] args) {
        int[] arrayInt = {1, -3, 5, 33, -44, 77, 4, 16};
        System.out.println(maxValue(arrayInt));
        int[] arrayIntEmpty = {};
        System.out.println(maxValue(arrayIntEmpty));
        //System.out.println("-->" + maxValue(null));
        System.out.println("====================================");
        char[] arrayChar = {'a', 'd', 'f', 'd'};
        System.out.println(maxValue(arrayChar));
        System.out.println("====================================");
        System.out.println(evensSum(arrayInt));
        int max = Integer.MAX_VALUE;
        System.out.println(max);
        int[] arrayMaxInt = new int[]{2147483646, 2};
        System.out.println("-->"+evensSum(arrayMaxInt));
        System.out.println("====================================");
        System.out.println(minPositiveValue(arrayInt));
    }

    public static int minPositiveValue(int[] array){
        if (array == null || array.length == 0) {
            System.out.println("invalid array");
            return -1;
        }
        int min = Integer.MAX_VALUE;  //-11  12   1
        for (int element : array){
            if(element > 0 && element < min)
                min = element;
        }
        return min;
    }

    public static long evensSum(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("invalid array");
            return -1L;
        }
        long sum = 0L;
        for (int element : array){
            if(element % 2 == 0)
                sum+=element; //sum = sum + element
        }
        return sum;
    }

    private static char maxValue(char[] ar) {
        if (ar == null || ar.length == 0) {
            System.out.println("invalid array");
            return '!';
        }
        char max = ar[0];
        for (char ch : ar) {
            if (ch > max)
                max = ch;
        }
        return max;
    }

    private static int maxValue(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("invalid array");
            return -1;
        }
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max)
                max = array[i];
        }
        return max;
    }
}
