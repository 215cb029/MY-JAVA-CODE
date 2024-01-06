import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        System.out.println("enter its power");
        int p=sc.nextInt();
       double ans= Math.pow(num,p);
        System.out.println((int)ans);
    }
}
