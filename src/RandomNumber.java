import java.util.Arrays;
import java.util.Scanner;

public class RandomNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] a = new int[4];
        for (int i = 0; i < 4; i++) {
            a[i] = (int) (Math.random() * (500 - 100 + 1))+100;
        }

        for (int data : a) {
            System.out.print(data + " ");
        }
        Arrays.sort(a);
        System.out.println();
        System.out.println("enter the highest number");
        int e = sc.nextInt();
        if (e == a[a.length-1]) {
            System.out.println("welcome to the Home page");
        } else {
            System.out.println("sorry u entered wrong number");
        }
    }
}
