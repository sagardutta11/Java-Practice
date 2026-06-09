package Array;
import java.util.Scanner;
public class Segregate0and1 {
    static void segregate01(int[] arr){
        int NumZero = 0;
        int NumOne = 0;
        for (int ele : arr){
            if(ele==0) NumZero++;
            else NumOne++;
        }
        for(int i = 0;i<arr.length;i++){
            if(i<NumZero)
                arr[i] = 0;
            else arr[i] = 1;
        }
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,0,1,0,1,1,0};
        segregate01(arr);
        System.out.print("New array: ");
        for (int ele: arr)
            System.out.print(ele+" ");
    }
}
