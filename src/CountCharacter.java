import java.util.*;


//"aabbbcc"=2a3b2c
public class CountCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String ans=getCount(sc.nextLine());
        System.out.println(ans);
    }
    public static String getCount(String s){
        s=s.replaceAll("\\s","");
        Map<Character,Integer>map=new LinkedHashMap<Character,Integer>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        Set set=map.keySet();
         List list=new ArrayList<>(set);
         String str="";
         for(Object data:list){
             str=str+map.get(data)+data;
         }

         return str;
    }
}
