import java.util.Scanner;
public class trappedWater{
    public static int TrapWater(int arr[]){
      int n=arr.length;
      int leftMax= new int[n];
      leftMax[0]=arr[0];
      for(int i=0;i<arr.length;i++){
        leftMax[i]=Math.max(arr[i],leftMax[i-1]);
      }
      int rightMax[]=new int[n];
      rightMax[n-1]=arr[n-1];
      for(int i=2;i>=0;i--){
        rightMax[i]=Math.max(arr[i],rightMax[i+1]);
      }
      int trpW=0;
      for(int i=0;i<n;i++){
        int watelevel=Math.min(leftMax[i],rightMax[i]);
          trpW += watelevel+arr[i];
         }
         return trpW;
          } 
      public static void main(String args[]){
    int arr[]={5,6,2,3,8};
   System.out.println(TrapWater(arr));
}
}