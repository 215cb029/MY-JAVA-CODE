public class BinaryAddition {

    public static void main(String[] args) {
        String n="10010";
        String m="111011";
        int num1= Integer.parseInt(n,2);
        int num2= Integer.parseInt(m,2);
        int res=num1+num2;
        System.out.println(Integer.toBinaryString(res));
    }
}
