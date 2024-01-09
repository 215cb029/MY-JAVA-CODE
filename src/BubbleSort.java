import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[]arr={34,12,65,35,29,63,25};
        int[]ans=sort(arr);
        System.out.println(Arrays.toString(ans));
    }
    public static int[] sort(int[]a){
        int temp;
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        return a;
    }
}
