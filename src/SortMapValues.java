import java.util.*;

public class SortMapValues {
    public static void main(String[] args) {
        String s="pneumonoultramicroscopicsilicovolcanoconiosis";
        Map<Character,Integer>map=new TreeMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
        System.out.println(map);
        sortValues(map);
    }
    public static void sortValues(Map<Character,Integer>map){
     Set<Map.Entry<Character,Integer>>set  = map.entrySet();
     List<Map.Entry<Character,Integer>>list=new ArrayList<>(set);
     Collections.sort(list,(c1,c2)->c1.getValue()>c2.getValue()?1:c1.getValue()<c2.getValue()?-1:0);
        System.out.println(list);
    }

}
