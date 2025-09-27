package lesson01;

public class FirstClass {
    public int quantity = 15;
    private int quantity1 = 15;
    int quantity2 = 15;
    static char ch1;
    public static void main(String[] args) {
        byte b = 127; //-128 - 127
        short s = -32_768; //32767
        int i = 2_147_483_647; //-2_147_483_648
        long longMax = 9_223_372_036_854_775_807L; //8
        long longMin = -9_223_372_036_854_775_808L;
        //=========================================
        float f = 10.f; //10.0f
        double d = -100.12; //8bytes -1.7*10^308 until +1.7*10^308

        double d1 = 5.0/2;
        System.out.println("d1-->" +d1);
        //=========================================
        boolean bool = true; //false
        //=========================================
        char c = 'a';
        //=========================================
        String str = "abc";

    }
}
