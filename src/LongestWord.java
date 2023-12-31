/*
Longest Word
Have the function LongestWord(sen) take the sen parameter being passed and return the longest word
in the string. If there are two or more words that are the same length, return the first word from the
string with that length. Ignore punctuation and assume sen will not be empty. Words may also contain
numbers, for example "Hello world123 567"
 */
import java.util.*;
public class LongestWord {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st1=sc.nextLine();
        String st2=st1.replaceAll("[^A-Za-z\\s]","");
getLongest(st2);
    }
    public static void getLongest(String s){
String[]str=s.split("\\s");
Arrays.sort(str,new MyComparator());
        System.out.println(str[0]);
    }
}
class MyComparator implements Comparator{
    public int compare(Object e1,Object e2){
        String a=(String)e1;
        String b=(String)e2;
        if(a.length()>b.length()){
            return -1;
        } else if (a.length()<b.length()) {
            return 1;
        }else {
            return 0;
        }
    }


}
