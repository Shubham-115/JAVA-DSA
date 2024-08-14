import java.util.Scanner;
public class buyAndpro{
    public static int Max(int value[]){
        int buy=value[0];
        int profit=0;
        for(int i=1;i<value.length;i++){
            if(buy<value[i]){
                profit=Math.max(value[i]-buy,profit);
            }
            else{
                buy=value[i];
            }
        }
        return profit;
    }
    public static void main(String args[]){
        int arr[]={1,2,8,4};
        System.out.println(Max(arr));

    }
}