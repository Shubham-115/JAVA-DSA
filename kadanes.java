import java.util.Scanner;
public class kadanes{
    public static void maxsubarrSum(int arr[]){
        int cs=0;
        int ms= Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            cs+=arr[i];
            if(cs<0){
                cs=0;
            }
            ms= Math.max(cs,ms);
            }
            System.out.println("the maximum of subArray Sum is ="+ms);
    }
    public static void main(String args[]){
        int arr[]={-2,-5,6,8,-1,2};
        maxsubarrSum(arr);
    }
}