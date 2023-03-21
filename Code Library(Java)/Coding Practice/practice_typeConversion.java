public class practice_typeConversion {
    public static void main(String[] args) {
        // type conversion, type wielding, implicit conversion
        int a = 10;
        long b = a;
        System.out.println(b);

        long a1 = 100;
        // int b1 = a1; did not work well
        System.out.println(a1);

        // type casting, narrow, explicit casting

        int p = 10;
        byte q = (byte) p;

        System.out.println(p + " , " + q);

    }
}
