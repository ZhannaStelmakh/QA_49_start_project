package lesson04;

import java.util.Arrays;

public class ArraysMethods {
    public static void main(String[] args) {
        int[] arrInt1 = {1, 3, 5, 4, 7, 9};
        int[] arrInt2 = {1, 3, 5, 4, 7, 9};
        int[] arrInt3 = {1, 3, 5, 4, 7, 9, 33};

        System.out.println(Arrays.equals(arrInt1, arrInt2));
        System.out.println(Arrays.equals(arrInt1, arrInt3));
        System.out.println("================================");
        int[] arrInt4 = {22, 1, 33, 2, 2, 5, 7};
        Arrays.sort(arrInt4);
        System.out.println(Arrays.toString(arrInt4));
        System.out.println("================================");
        int[] copyInt1 = Arrays.copyOf(arrInt4, arrInt4.length);
        int[] copyInt2 = Arrays.copyOf(arrInt4, 3);
        int[] copyInt3 = Arrays.copyOf(arrInt4, 10);
        System.out.println(Arrays.toString(copyInt1));
        System.out.println(Arrays.toString(copyInt2));
        System.out.println(Arrays.toString(copyInt3));
        int[] copyInt4 = Arrays.copyOfRange(arrInt4, 2,5);
        System.out.println(Arrays.toString(copyInt4));
        System.out.println("==========================");
        int[] arrSort = {2,4,1,6,8,0,9};
        Arrays.sort(arrSort);
        System.out.println(Arrays.toString(arrSort));
        System.out.println(Arrays.binarySearch(arrSort, 0));
        //1 3 5 6 7 | 9 11 | 14 15
    }
}
