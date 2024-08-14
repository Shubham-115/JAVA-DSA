import java.util.Scanner;
public class Arr2ins{
    public static boolean twins(int marks[]){
        for(int i=0;i<marks.length;i++){
            int current= marks[i];
            for(int j=i+1;j<marks.length;j++){
                if(current==marks[j]){
                  return true;
                }
            }
            }
            return false;
            
        }
    public static void main(String args[]){
        int arr[]={1,5,2,3,1,4};
        System.out.println(twins(arr));
    }
}