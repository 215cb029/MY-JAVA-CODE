import java.util.*;

public class CombinationTwoSortedArray {
    public static void main(String[] args) {
        int[]a={10,15,40,51,74};
        int[]b={17,20,31,42,68};
        ArrayList<Integer>l=new ArrayList<Integer>();
for(int data:a){
    l.add(data);
}
for(int data:b){
    l.add(data);
}
Collections.sort(l);
Object[]o=l.toArray();
for(Object data:o){
    System.out.print(data+" ");
}
    }
}
