import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String firstString="Army";
        String secondString="mary";
        System.out.println(isAnagram(firstString,secondString));
    }
    public static boolean isAnagram(String s1,String s2){
        char[]arr1=s1.toLowerCase().toCharArray();
        char[]arr2=s2.toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1,arr2);


    }
}