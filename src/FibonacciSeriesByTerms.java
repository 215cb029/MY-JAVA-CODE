import java.util.Scanner;

public class FibonacciSeriesByTerms {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter how many terms");
        int t=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a+"\n"+b);
        t=t-2;
        int c;
        for(int i=1;i<=t;i++){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
}
