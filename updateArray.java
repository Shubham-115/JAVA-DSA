import java.util.Scanner;
public class updateArray{
    public static void update(int marks[]){
        for(int i=0;i<marks.length;i++){
            marks[i]=marks[i]+1; 
        }
    }
    public static void main(String args[]){
        int arr[]={88,55,54,48};
        update(arr);
        for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}