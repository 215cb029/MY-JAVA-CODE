/*
1
121
12321
1234321
123454321
 */
public class NumberPattern_1 {
    public static void main(String[]args){
        for(int i=1;i<=5;i++){
            int count=i;
            for(int j=1;j<2*i;j++){
                if(j<=i) {
                    System.out.print(j);
                }else{
                    count--;
                    System.out.print(count);
                }
            }
            System.out.println();
        }
    }

}
