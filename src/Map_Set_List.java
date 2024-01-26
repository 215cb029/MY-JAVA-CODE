import java.util.*;
public class Map_Set_List {

    public static void main(String args[])
    {
        Comparator<Map.Entry<Character,Integer>> cm=(e1,e2)->-e1.getValue().compareTo(e2.getValue());
        String s="java is my favorite language";
        s=s.replaceAll("\\s","");
        TreeMap<Character,Integer>map=new TreeMap<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);

        }
        Set<Map.Entry<Character,Integer>> set=map.entrySet();
        List<Map.Entry<Character,Integer>> list=new ArrayList<>(set);
        Collections.sort(list,cm);
        System.out.println(list);



    }
}
