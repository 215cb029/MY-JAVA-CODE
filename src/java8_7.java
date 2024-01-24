import java.util.stream.*;
public class java8_7 {
    public static void main(String[] args) {
        Stream<Integer> s=Stream.of(4,7,8,6,2);
       Stream<Integer> t= s.sorted();
        t.forEach(i->{
            System.out.println("the square of "+i+" is "+i*i);
                }

                );

    }
}
