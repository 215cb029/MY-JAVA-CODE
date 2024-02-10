import java.util.*;
public class Fibonacci_Recursion {
    static int a=0,b=1,c;
    static{
        System.out.println("how many number u want");
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(a+"\n"+b);
        printFibonacci(n-2);
    }
    public static void printFibonacci(int n){
        if(n>=1){
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
            printFibonacci(n-1);
        }
    }
}
