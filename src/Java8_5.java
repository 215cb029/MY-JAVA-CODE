import java.util.List;
import java.util.stream.*;

public class Java8_5 {
    public static void main(String[] args) {
        List<String> li=List.of("sunny leone","kajal agrawal","prabhas","anushka sheety","mallika sherawat");
        System.out.println("sorting acoding to default natural sorting order");
        List<String>newList1=li.stream().sorted((s1,s2)->s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(newList1);
        System.out.println("sorting acoding to reverse natural sorting order");
        List<String>newList2=li.stream().sorted((s1,s2)->-s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(newList2);
        System.out.println("sorting acoding to increasing length");
        List<String>newList3=li.stream().sorted((s1,s2)->s1.length()>s2.length()?1:s1.length()<s2.length()?-1:0).collect(Collectors.toList());
        System.out.println(newList3);
        System.out.println("sorting acoding to increasing length");
        List<String>newList4=li.stream().sorted((s1,s2)->s1.length()>s2.length()?-1:s1.length()<s2.length()?1:0).collect(Collectors.toList());
        System.out.println(newList4);
    }
}
