import java.util.Arrays;
class Student {
    String name;
    int mark;

    Student(String name, int mark) {
        this.name = name;
        this.mark = mark;
    }
}

public class Sort_Student_By_Marks {
    public static void main(String[] args) {
        Student[]arr={new Student("jitu",564),new Student("chandu",534),new Student("pratap",595),
        new Student("banty",495),new Student("siva",501)
        };
        Arrays.sort(arr,(c1,c2)->c1.mark>c2.mark?-1:c1.mark<c2.mark?1:0);
        for(Student data:arr){
            System.out.println(data.name+":"+data.mark);
        }
    }
}
