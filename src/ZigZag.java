/*
G      s      G     s
e  k   F   r  e   k
e      o      e

Resuslt=   GsGsekFrekeoe
 */


import java.util.Arrays;

public class ZigZag {
    public static void main(String[] args) {
        String s="GeeksForGeeks";
        convert(s);
    }
    public  static void convert(String s){
        String[]arr=new String[3];
        Arrays.fill(arr,"");
        int row=0;
        boolean down=true;
        for(int i=0;i<s.length();i++){
arr[row]=arr[row]+s.charAt(i);
if(row==0){
   down=true;

} else if (row==2) {
    down=false;

}

            if(down){
             row++;
                 }
            else if(down==false) {
            row--;

            }
        }
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
        }

    }
}
