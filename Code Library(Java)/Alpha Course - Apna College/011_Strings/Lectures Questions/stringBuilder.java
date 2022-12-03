public class stringBuilder {
    public static void main(String[] args) {

        // assume if you want to simply add character in a string ... simply a character
        // for e.g like in String "VsCode" you want to add 's' make it VsCodes.

        // but imagine you want to add many character in a string then you will take a
        // loop but it will result in O(n^2)

        // below example---

        String str = "VSCODE";
        for (char i = 'a'; i <= 'z'; i++) {
            str += i;
        }
        System.out.println(str);

        // it will result in like this
        // VSCODEa
        // VSCODEab
        // VSCODEabc
        // VSCODEabcd
        // VSCODEabcde
        // VSCODEabcdef
        // VSCODEabcdefg
        // VSCODEabcdefgh
        // VSCODEabcdefghi
        // VSCODEabcdefghij
        // VSCODEabcdefghijk
        // VSCODEabcdefghijkl
        // VSCODEabcdefghijklm
        // VSCODEabcdefghijklmn
        // VSCODEabcdefghijklmno
        // VSCODEabcdefghijklmnop
        // VSCODEabcdefghijklmnopq
        // VSCODEabcdefghijklmnopqr
        // VSCODEabcdefghijklmnopqrs
        // VSCODEabcdefghijklmnopqrst
        // VSCODEabcdefghijklmnopqrstu
        // VSCODEabcdefghijklmnopqrstuv
        // VSCODEabcdefghijklmnopqrstuvw
        // VSCODEabcdefghijklmnopqrstuvwx
        // VSCODEabcdefghijklmnopqrstuvwxy
        // VSCODEabcdefghijklmnopqrstuvwxyz

        // but i want output like this VSCODEa then VSCODEb them VSCODEc .......so
        // on....

        StringBuilder string = new StringBuilder("VSCODE");

        for (char i = 'a'; i <= 'z'; i++) {
            string.append(i);
        }
        System.out.println(string);
        System.out.println(string.length());

        // note---- we can easily convert stringBuilder into string

    }
}
