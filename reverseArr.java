import java.util.Scanner;
public class reverseArr{
    public static void Rverse(int num[]){
        int start=0;
        int end= num.length-1;
        while(start<=end){
            int temp = num[start];
            num[start]=num[end];
            num[end]=temp;
            start++;
            end--;
        }
    }
public static void main(String args[]){
    int arr[]={5,4,3,2,1};
    Rverse(arr);
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
System.out.println();
}
}