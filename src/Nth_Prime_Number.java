import java.util.*;
import java.lang.*;


public class Nth_Prime_Number
{
    public static void main(String args[])
    {



        Scanner sc=new Scanner(System.in);
        System.out.println("enter nth prime number");
        int num=sc.nextInt();
        System.out.println(   apply(num) );
    }
    public static int apply(int n){
        int i=0;
        int p=1;
        int prime=0;
        if(n==0){
            return 0;
        }
        while(i!=n){
           if(checkPrime(p)){
               i++;
                prime=p;
           }
           p++;
        }
        return prime;

    }
    public static boolean checkPrime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }

}