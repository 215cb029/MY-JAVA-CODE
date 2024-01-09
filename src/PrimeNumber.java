import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter beginning");
        int b=sc.nextInt();
        System.out.println("enter end");
        int e=sc.nextInt();
        for(int i=b;i<=e;i++){
            int count=0;
            for(int j=1;j<=e;j++){
                if(i%j==0){
                    count++;
                }
            }
            if(count==2) {
                System.out.println(i);
            }
        }

    }
}
