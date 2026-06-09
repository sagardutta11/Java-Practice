package Array;
import java.util.Scanner;
public class RotateArray {
        static void rotate(int[] nums, int k) {
            int n = nums.length;
            int d = k%n;
            reverse(nums,0,n-1);
            reverse(nums,0,d-1);
            reverse(nums,d,n-1);
        }
        static void reverse(int[] arr, int i, int j){
            while(i <j ){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int[] arr = {12,23,45,78,32};
            System.out.print("Enter how many steps you want to rotate: ");
            int r = sc.nextInt();
            rotate(arr,r);
            for (int ele : arr)
                System.out.print(ele+" ");
    }
    }
