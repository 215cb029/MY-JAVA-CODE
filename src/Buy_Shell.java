import java.util.ArrayList;
import java.util.Collections;

public class Buy_Shell {
    public static void main(String[] args) {
        int[] price = {7, 1, 5, 3, 6, 4};
        System.out.println("the profit is:"+Profit(price));
    }

    public static int Profit(int[]price){
        ArrayList<Integer>list=new ArrayList<>();
        for(int i=0;i<price.length;i++){
            int buy=price[i];
            for(int j=i+1;j<price.length;j++){
                int shell=price[j];
                if(shell>buy){
                    list.add(shell-buy);
                }
            }
        }
        Collections.sort(list);
        if(list.size()==0){
            return 0;
        }
        return list.get(list.size()-1);
    }
}
