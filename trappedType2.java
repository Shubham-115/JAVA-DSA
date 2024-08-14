import java.util.Scanner;
public class trappedType2{
    public static int trapAcid(int value[]){
        int result=0;
        int left=0;
        int right=value.length-1;
        int leftmax=value[left];
        int rightmax=value[right];
        while(left<right){
    
            if(leftmax<rightmax){
                left++;
                leftmax=Math.max(leftmax,value[left]);
                result+=leftmax-value[left];

            }
            else{
                right--;
                rightmax=Math.max(rightmax,value[right]);
                result+=rightmax-value[right];
            }
        }
        return result;
    }
        public static void main(String args[]){
            int arr[]={1,9,6,3,7};
            System.out.println(trapAcid(arr));
        }
        }
      