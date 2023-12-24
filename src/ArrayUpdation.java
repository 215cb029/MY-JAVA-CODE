import java.util.Scanner;

public class ArrayUpdation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int[] b = increase(a);
        for (int data : b) {
            System.out.print(data + " ");
        }
    }

    public static int[] increase(int[] a) {
        int[] c = new int[a.length];
        int count = 1;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 == 0) {
                c[i] = a[i] + count++;
            } else {
                c[i] = a[i] - count++;
            }

        }
        return c;

    }
}
