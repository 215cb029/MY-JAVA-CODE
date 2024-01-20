import java.util.function.*;
import java.util.*;
public class Java8_2 {
    public static void main(String[]args){
        Predicate<String>p=s->{
            StringBuffer sb=new StringBuffer(s);
           String n= sb.reverse().toString();
           return n.equalsIgnoreCase(s);
        };
        List<String>al=List.of("manoranjan","malayalam","java");
        for(Object data:al){
            String s=String.valueOf(data);
            if( p.test(s)){
                System.out.println("palindrom");
            }else {
                System.out.println("not palindrom");
            }
        }

    }
}
