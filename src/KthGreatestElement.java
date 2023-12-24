import java.util.Arrays;
import java.util.Scanner;
public class KthGreatestElement {

    public static void main(String[] args) {
        int[]a={12,78,45,32,65,48,72,4,16,89};
       greatestElement(a);
    }
    static void greatestElement(int[]a){
        Scanner sc=new Scanner(System.in);
        Arrays.sort(a);
        System.out.println("find kth greatest element");
        int k=sc.nextInt();
        if(k<=a.length){
            System.out.println(a[a.length-k]);
        }else {
            throw new ArrayIndexOutOfBoundsException("find greatest within"+a.length);
        }
    }
}

