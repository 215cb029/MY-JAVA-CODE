import java.util.*;
public class ArrayNumberShift {
    public static void main(String[] args) {
        int[]a={12,32,45,78,65,48,72,16,89};
        List l=shift(a);
        Object[]ob=l.toArray();

        for(Object o:ob){
            System.out.print(o+" ");
        }
    }


    public static List<Integer> shift(int[]a){
        //i want to shift till 3 index
        //All the element will shift to last
        List<Integer>al=new ArrayList();
        for(int i=4;i<a.length;i++){
            al.add(a[i]);
        }
        for(int i=0;i<=3;i++){
            al.add(a[i]);
        }
        return al;

    }
}
