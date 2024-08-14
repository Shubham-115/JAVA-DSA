import java.util.Scanner;
public class subAr2{
    public static int subArrays(int marks[]){
        for(int i=0;i<marks.length;i++){
            for(int j=i+1;j<=marks.length;j++){
                for(int k=i;k<j;k++){
                System.out.print(marks[k]+" ");
                 }
                     System.out.println();
            }
        }      return 0;
    }
    public static void main(String args[]){
        int arr[]={2,4,6,8,10};
        subArrays(arr);
        
    }
}
