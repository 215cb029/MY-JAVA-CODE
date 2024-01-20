import java.util.function.*;
import java.util.*;
class Stud{
    String name;
    double mark;
    Stud(String name,double mark){
        this.name=name;
        this.mark=mark;
    }

}
public class java8_3 {
    public static void main(String[] args) {
        ArrayList<Stud> al=new ArrayList<Stud>();
    Supplier<ArrayList<Stud>>s=()->{
        al.add(new Stud("banty",550));
        al.add(new Stud("somyaa",521));
        return al;
    };

    List<Stud> li=s.get();
    Consumer<Stud>c=(ob)->{
        double  p=(ob.mark/600)*100;
        System.out.println(ob.name+" has "+p+"%");
    };
    for(Stud data:li){
        c.accept(data);
    }
    }
}
