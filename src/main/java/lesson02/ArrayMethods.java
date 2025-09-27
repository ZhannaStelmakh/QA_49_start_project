package lesson02;

public class ArrayMethods {
    public static void main(String[] args) {
        int[] arrayInt = new int[]{1, 2, 3, 4, 5};
        //[1] [2] [3] [4] [5]   length=5   last index = 4
        System.out.println(arrayInt[1]);
        //System.out.println(arrayInt[5]); wrong index
        double[] arrayDouble = new double[10];
        for (int i = 0; i < arrayDouble.length; i++) {
            System.out.print(arrayDouble[i] + " ");
        }
        byte[] byteArray = null;
        //System.out.println(byteArray.length);
        char[] charArray = new char[0];
        char[] charArray1 = new char[]{};
        System.out.println("charArray1.length-->" + charArray1.length);

        int summ = 0;
        for (int i = 0; i < arrayInt.length; i++) {
            //summ = summ + arrayInt[i];
            summ += arrayInt[i];
        }
        System.out.println("summ --> " + summ);

        summ = 0;
        for (int p : arrayInt) {
            summ = summ + p;
        }
        System.out.println("summ --> " + summ);

        String[] strArray = new String[]{"Ivan", "Petr", "Dasha", "Olga", "Victor"};
        printArrayReverse(strArray);
        String[] strEmptyArray = new String[]{};
        printArrayReverse(strEmptyArray);
        printArrayReverse(null);

        //A - 65  Z-90 ASCII
        char ch1 = 65;
        System.out.println(ch1);
        char ch2 = 'A';
        System.out.println(ch2);
        for (int i = 65; i <= 90; i++) {
            char c = (char) i;
            System.out.print(c);
        }
        System.out.println();
        System.out.println("=======================================");
        char[] chars = new char[]{'A', 'B', 'C', 'D'};
        for (char ch : chars) {
            System.out.print(ch + ":");
        }
        System.out.println();
        System.out.println("=======================================");
        char[] chars1 = new char[]{65, 66, 32, 67, 68};
        for (char ch: chars1){
            System.out.print(ch + ":");
        }

        int i = 2_147_483_647;
        //boolean[] booleans = new boolean[2_147_483_647];

        Computer[] compArray = new Computer[10];
        for (Computer comp : compArray){
            ComputerMain.printComputer(comp);
        }

        Computer computer3 = new Computer("Asus", 32, "i7", 256);
        Computer computer4 = new Computer("lenovo", 16, "i3", 512);
        Computer[] computers = new Computer[]{computer4, computer3, computer4};

        for (Computer comp : computers){
            System.out.println(comp.getCompany());
            ComputerMain.printComputer(comp);
        }
    }

    private static void printArrayReverse(String[] array) {
        if (array == null) {
            System.out.println("array is null");
            return;
        } else if (array.length == 0) {
            System.out.println("array is empty");
            return;
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(i + "-->" + array[i]);
        }
    }
}
