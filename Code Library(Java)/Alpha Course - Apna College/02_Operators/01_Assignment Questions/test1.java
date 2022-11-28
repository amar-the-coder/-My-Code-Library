public class test1 {

    public static void main(String[] args) {
        int x = 2, y = 5;
        int exp1 = (x * y / x); // first x multiply with y then it divide wth x bcz * has high precedence then y
        int exp2 = (x * (y / x)); // first y divide with x then result multiply with x
        System.out.print(exp1 + ",");
        System.out.print(exp2);
    }
}
