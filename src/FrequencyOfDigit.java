import java.util.*;
class FrequencyOfDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int f=sc.nextInt();
        int count=0;

        String s=String.valueOf(num);
        for(int i=0;i<s.length();i++){
            if(String.valueOf(s.charAt(i)).equals(String.valueOf(f)))
            {
                count++;
            }
        }
        System.out.println(f+" is repeated for "+count+" times");



    }
}
