import java.util.*;

public class CheckObjectEquality {
    public static void main(String[] args) {
        ArrayList al=new ArrayList();
        al.add(new String());
        al.add(new A());
        al.add(new B());
                al.add(new StringBuffer());
        for(Object data:al){
            Object e=data;
            if(e.getClass()==String.class){
                System.out.println("String Object");
            } else if (e.getClass()==StringBuffer.class) {
                System.out.println("StringBuffer object");
            } else if (e.getClass()==A.class) {
                System.out.println("A object");
            }else {
                System.out.println("B object");
            }

        }

    }
}
class A{

}
class B{

}

