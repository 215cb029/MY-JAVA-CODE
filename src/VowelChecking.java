import java.util.*;
public class VowelChecking {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i;
        for( i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='a'||c=='e'||c=='o'||c=='i'||c=='u'){
                System.out.println("yes the String contains vowel");
                break;
            }
        }
        if(i==s.length()){
            System.out.println("No the String doesn't contain vowel");
        }
    }
}

