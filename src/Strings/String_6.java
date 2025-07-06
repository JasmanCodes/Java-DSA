package Strings;
/// performance
public class String_6 {

    public static void main(String[] args) {

        String series = "";
        for(int i = 0; i<26; i++){
            char ch = (char)('a' + i);
            series = series +ch;  // wastage of space because evertime there will be a string save din pool a, ab,abc---- ans so on
            /// it will print last ato z only but every step will be in stored

            System.out.println(ch);
        }
        System.out.println(series);

    }

    ///  it would b egreat if ther ewill be a datatype that allows us to modify the value because string does not allows it
    ///  we can use stringbuilder
}
