import java.util.Arrays;
import java.util.Scanner;

public class Divide_String_N_Equal_Parts {

    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("how many parts u need");
        int n = sc.nextInt();
        if (s.length() % n != 0) {
            System.out.println("The String can not be equally divided");
        } else {
            int c = s.length() / n;
            String[] str = new String[n];
            Arrays.fill(str, "");
            int j = 0;
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                str[j] += s.charAt(i);
                count++;
                if (count == c) {
                    count = 0;
                    j++;
                }
            }
            for (String data : str) {
                System.out.println(data);
            }
        }
    }
}
