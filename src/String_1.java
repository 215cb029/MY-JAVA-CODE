/*
input="ABCD"
output="BCDE"
 */
public class String_1 {
    public static void main(String[] args) {
        String s="ABCD";
        s=s.substring(1);
        char c=s.charAt(s.length()-1);
        c++;
        s=s.concat(String.valueOf(c));
        System.out.println(s);
    }
}
