public class BigStarPattern {
    public static void main(String[] args) {
int row=7;
        for(int i=1;i<=7;i++){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            for(int k=1;k<2*row;k++){
                System.out.print(" ");
            }
            for(int l=1;l<2*i;l++){
                System.out.print("*");
            }
            for(int m=1;m<2*row;m++){
                System.out.print(" ");
            }
            for(int n=1;n<=i;n++){
                System.out.print("*");
            }

            row--;
            System.out.println();
        }
        for(int a=1;a<=9;a++){
            for(int b=1;b<=29;b++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
