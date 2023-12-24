import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[]b={12,78,45,32,65,48,72,4,16,89};
        Arrays.sort(b);
//4 12 16 32 45 65 72 78 89
        System.out.println(Arrays.binarySearch(b,12));


    }

}
