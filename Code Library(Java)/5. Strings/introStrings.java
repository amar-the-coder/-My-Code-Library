package Strings;

import java.util.Scanner;

public class introStrings {

  public static void main(String[] args) {

    // declare a string
    String name = "name";
    String fullName = "Elon Musk";
    String Sen = "Elon Founded Space X";

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

  }

}
