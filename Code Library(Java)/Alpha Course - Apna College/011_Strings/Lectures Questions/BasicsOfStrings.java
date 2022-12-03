import java.util.Scanner;

public class BasicsOfStrings {
    public static void main(String[] args) {
        // declare a string
        // 1. String name = "name";
        // 2. String fullName = "Elon Musk";
        // 3. String Sen = "Elon Founded Space X";

        // user input;
        Scanner sc = new Scanner(System.in);

        // String name1= sc.next(); // take only one word
        // System.out.println(name1);

        System.out.println("enter string");
        String name2 = sc.nextLine(); // take full line

        System.out.println(name2);

        // strings functions

        // 1. Concat

        String firstName = "tony";
        String lastName = "stark";
        String FullName = firstName + " " + lastName;
        System.out.println(FullName);

        // 2. length

        System.out.println(FullName.length());

        // 3. charAt

        for (int i = 0; i < FullName.length(); i++) {
            System.out.println(FullName.charAt(i));
        }

        // 4. compare

        String one = "vanshaj";
        String two = "vaani";

        if (one.compareTo(two) == 0)
            System.out.println("strings are equal");
        else
            System.out.println("strings are not equal");

        // s1=s2 return 0
        // s1>s2 return +ve value
        // s1<s2 return -ve value

        // 5. substring

        // substring("beg index" , "end index");

        String sentence = "Java is easy than c++";

        String substring = sentence.substring(15, sentence.length());
        System.out.println(substring);

        // 6. contains

        String amar = "amarjeet";
        System.out.println(amar.contains("mar"));

        // 7. replaceALL

        String str_sample = "coder";

        System.out.println(str_sample.replace("cod", "develop"));

        // 8. index of

        String str = "google";
        System.out.println("index of character " + str.indexOf("g"));

        // 9. toUpperCase and tolowerCase

        String str2 = "Google";

        System.out.println("convert to lowercase " + str2.toLowerCase());
        System.out.println("convert to uppercase " + str2.toUpperCase());

        // 10. working of compare to and equals
        String s1 = "Amarjeet";
        String s2 = "Amarjeet";
        String s3 = new String("Amarjeet");

        if (s1 == s2)
            // this will print
            System.out.println("yes equal");
        else
            System.out.println("not equal");
        if (s1 == s3)
            System.out.println("yes equal");
        else
            // this will print
            System.out.println("not equal");

        if (s1.equals(s3))
            System.out.println("yes equal with working on  equals of s1==s3");

        // question is why-- because
        // == this compare on object basis
        // equals compare on value basics
        sc.close();

    }
}
