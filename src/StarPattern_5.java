public class StarPattern_5 {
    public static void main(String[] args) {
        int count=1;
        for(int i=1;i<5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++) {
                if (k == 1 || k == 2 * i - 1 || k == count) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            count++;
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                if(i==5){
                    System.out.print("*");
                }
              else  if(k==1||k==2*i-1||k==count){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            count--;
            System.out.println();
        }
    }

}
