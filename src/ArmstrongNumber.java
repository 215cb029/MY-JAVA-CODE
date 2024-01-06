import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int num=sc.nextInt();
        String n=String.valueOf(num);
        int digit=n.length();
        int copy=num;
        int res=0;
        int rem;
        while(num!=0){
            rem=num%10;
            res=res+(int)Math.pow(rem,digit);
            num=num/10;
        }
        if(copy==res){
            System.out.println("it is Armstrong number");
        }else{
            System.out.println("it is not a armstrong number");
        }

    }
}
