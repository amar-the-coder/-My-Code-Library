public class clearRangeOfBits {
    public static void main(String[] args) {
        int num = 1023;
        int i = 2, j = 6;
        int a = ((~0) << (j + 1));
        int b = (1 << i) - 1;
        int bitMask = a | b;
        System.out.println(num & bitMask);

    }
}
