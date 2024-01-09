import java.util.Arrays;

public class Sort_By_Student_Name {
    public static void main(String[] args) {
        Student[]arr={new Student("jitu",564),new Student("chandu",534),new Student("pratap",595),
                new Student("banty",495),new Student("siva",501)
        };
        Arrays.sort(arr,(c1,c2)->c1.name.compareTo(c2.name));
        for(Student data:arr){
            System.out.println(data.name+":"+data.mark);
        }
    }
}
