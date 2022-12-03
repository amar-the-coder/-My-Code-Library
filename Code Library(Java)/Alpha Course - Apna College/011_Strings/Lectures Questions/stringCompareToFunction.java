public class stringCompareToFunction {
    public static void main(String[] args) {
        // question : print the largest string using compare to function
        // compare to function
        // s1==s2 then it will return 0
        // s1<s2 then it will return -1
        // s1>s2 then it will return 1
        String fruits[] = { "apple", "mango", "banana" };
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0)
                largest = fruits[i];
        }
        System.out.println(largest);
    }
}
