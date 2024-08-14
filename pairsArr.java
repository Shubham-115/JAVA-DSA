import java.util.Scanner;
public class pairsArr{
    public static void main(String args[]){
        int arr[]={55,66,33,48,45};
        int tp=0;
        for(int i=0; i<arr.length;i++){
            int current = arr[i];
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+current+","+arr[j]+")");
                tp++;
            }
        }
        System.out.println();
        System.out.println("totol pairs ="+tp);
    }
}