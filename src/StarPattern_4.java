public class StarPattern_4 {
    public static void main(String[] args) {
        for(int i=1;i<5;i++){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                if(i>1){
                    if(k==1||k==2*i-1){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for(int i=5;i>=1;i--){
            for(int j=5;j>=i;j--){
                System.out.print(" ");
            }
            for(int k=1;k<2*i;k++){
                if(k==1||k==2*i-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}
