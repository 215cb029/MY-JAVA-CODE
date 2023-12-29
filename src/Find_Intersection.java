import java.util.*;
public class Find_Intersection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        find(sc.nextLine(),sc.nextLine());
    }
    public static void find(String s1,String s2){
        s1=s1.replaceAll(","," ");
        s2=s2.replaceAll(","," ");
        String[]a=s1.split(" ");
        String[]b=s2.split(" ");
        Set set1=new HashSet();
        Set set2=new HashSet();
        for(int i=0;i<a.length;i++){
set1.add(a[i]);
        }
        for(int i=0;i<b.length;i++){

               if(set1.contains(b[i])){
               set2.add(b[i]);
           }

        }
        System.out.println(set2);
    }
}
//1, 3, 4, 7, 13", "1, 2, 4, 13, 15"