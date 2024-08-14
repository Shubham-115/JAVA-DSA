import java.util.Scanner;
public class bsearch{
    public static int binarySearch( int arr[],int key){
       int start=0;
        int end=arr.length;
        int mid=(start+end)/2;
        while(start<=end){
        if(arr[mid]==key){
            return mid;
        }   else if(arr[mid]<key){
                    start=mid+1;
                    
        }
            else if(arr[mid]>key){  
                    end=mid-1;
                     mid=(start+end)/2;
        }
                  mid=(start+end)/2;
        }
        return -1;
    } 
        public static void main(String args[]){
        int marks[]={99,88,57,97,65};
        int key=57;
        System.out.println("index key is  "+binarySearch(marks,key));
}
}
