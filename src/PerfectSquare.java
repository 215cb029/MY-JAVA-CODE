import java.util.Scanner;

public class PerfectSquare {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
         double n=sc.nextInt();
        double ans=Math.sqrt(n);
        if(ans-Math.floor(ans)==0){
            System.out.println("it is a perfect square");
        }else{
            System.out.println("it is not a perfect square");
        }
            }
}
