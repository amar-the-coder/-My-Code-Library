public class convertFirstLetterOfEachWord {
    public static void main(String[] args) {
        String str = "apna college alpha course";
        String ans = toUpperCase(str);
        System.out.println(ans);
    }

    public static String toUpperCase(String str) {
        // making a new string builder so that we can use append function
        StringBuilder helper_string = new StringBuilder("");
        // Making the first letter of your string to uppercase
        char ch = Character.toUpperCase(str.charAt(0));
        // appending that uppercase into stringBuilder
        helper_string.append(ch);
        // loop
        for (int i = 1; i < str.length(); i++) {
            // founding when space is there
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                // appending space in string builder
                helper_string.append(str.charAt(i));
                // moving to next element after space
                i++;
                // convert element after space to uppercase
                helper_string.append(Character.toUpperCase(str.charAt(i)));
            } else
                // not space found then this will found
                helper_string.append(str.charAt(i));
        }
        return helper_string.toString();
    }
}
