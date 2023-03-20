public class clearLastDigit {
    public static void main(String[] args) {
        int number = 15;
        int position = 2;
        int bitMask = (~0) << position;
        System.out.println(number & bitMask);
    }
}
