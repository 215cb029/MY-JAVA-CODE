import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        long fact=1;
        while(num>0){
            fact=fact*num--;
        }
        System.out.println("factorial of the number is "+fact);
    }
}
