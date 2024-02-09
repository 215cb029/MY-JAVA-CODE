public class RemoveDuplicate {

    public static void main(String[] args) {
        String s="GeeksForGeeks";
        String n="";
       for (int i=0;i<s.length();i++){
            if(!n.contains(String.valueOf(s.charAt(i)))){
                n+=s.charAt(i);
            }
        }
        System.out.println(n);
    }
}
