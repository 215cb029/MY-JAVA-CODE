// take student mark in list and give gress mark 5 to the failware student
import java.util.*;
import java.util.stream.*;
public class java8_4 {
    public static void main(String[] args) {
        List<Integer>student=List.of(45,30,32,50,60,33);
        List<Integer>failStudent=student.stream().filter(i->i<35).collect(Collectors.toList());
        List<Integer>updateStudent=failStudent.stream().map(i->i+5).collect(Collectors.toList());
        System.out.println(updateStudent);
    }
}
