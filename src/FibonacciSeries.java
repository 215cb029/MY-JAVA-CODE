import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("till which number?");
        int num=sc.nextInt();
        int a=0;
        int b=1;
        System.out.println(a+"\n"+b);
        int c=0;
        while(c!=num){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            if(c>num){
                System.out.println("you entered a wrong number");
                break;
            }
        }
    }

}
