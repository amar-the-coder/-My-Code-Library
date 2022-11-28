public class largestArray {
    public static void main(String[] args) {
        // point to remember
        // -Infinity = INTEGER.MIN_VALUE
        // +Infinity = INTEGER.MAX_VALUE

        int numbers[] = { 1, 2, 3, 4, 5, 6 };
        largest(numbers);

    }

    public static void largest(int numbers[]) {
        int sabseBadaNumber = Integer.MIN_VALUE;
        int sabseChotaNumber = Integer.MAX_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (sabseBadaNumber < numbers[i]) {
                sabseBadaNumber = numbers[i];
            }
            if (sabseChotaNumber > numbers[i]) {
                sabseChotaNumber = numbers[i];
            }
        }

        System.out.println("The largest value is : " + sabseBadaNumber);
        System.out.println("The smallest value is : " + sabseChotaNumber);
    }
}
