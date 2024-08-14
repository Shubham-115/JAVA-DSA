import java.util.Scanner;
public class linearSearch{
    public static void lsearch(int marks[],int key){
         for(int i=0;i<marks.length;i++){
            if(marks[i]==key){
                System.out.println("index is ="+ i); 
            }
         }
    }
public static void main(String args[]){
int arr[]={5,8,6,9,4};
lsearch(arr,6);
}
}