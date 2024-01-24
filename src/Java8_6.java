import java.util.*;
import java.util.function.*;
public class Java8_6 {
    public static void main(String[] args) {
        List<Integer>li=List.of(5,10,22,43,56);
        long n=li.stream().count();
        System.out.println(n+" element in list");
        li.stream().forEach(System.out::println);
        Consumer<Integer>c=i->{
            System.out.println("the square of "+i+"is "+i*i);
        };
        li.stream().forEach(c);
    }
}
