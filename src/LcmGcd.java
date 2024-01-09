import java.util.Scanner;

public class LcmGcd {
    public static void main(String[] args) {
        int lcm=1;
        int gcd=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter num1");
        int num1=sc.nextInt();
        System.out.println("enter num2");
        int num2=sc.nextInt();
        for(int i=1;i<=num1&&i<=num2;i++){
            if(num1%i==0&&num2%i==0){
                gcd=i;
            }
        }
        lcm=num1*num2/gcd;
        System.out.println("lcm="+lcm+"\n"+"gcd="+gcd);
    }
}
