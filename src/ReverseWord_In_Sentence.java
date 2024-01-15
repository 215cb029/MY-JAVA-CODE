public class ReverseWord_In_Sentence {

        public static void main(String[] args) {
            String s="java is great";
            System.out.println(getString(s));
        }
        public  static String getString(String s){
            String[]arr=s.split("\\s");
            String n ="";
            for(String data:arr){
                n   =n+rev(data)+" ";
            }
            return n;
        }
        public static String rev(String s){
            StringBuffer sb=new StringBuffer(s);
            sb.reverse();
            return sb.toString();
        }
    }







