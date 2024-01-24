import java.util.stream.*;
public class Java8_8 {
    public static void main(String[] args) {
        Integer[]a={12,54,32,15,78};

        Stream.of(a).forEach(System.out::println);
    }
}
