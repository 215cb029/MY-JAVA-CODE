import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Java8 {

    public static void main(String[]args){
        ArrayList<String> al=new ArrayList<>();
        al.add("Bca");
        al.add("Xyz");
        al.add("Mca");
        Comparator<String>c=(e1,e2)->-e1.compareTo(e2);
        Collections.sort(al,c);
        System.out.println(al);
    }
}
