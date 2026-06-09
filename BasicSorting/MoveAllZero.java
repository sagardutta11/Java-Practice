package BasicSorting;
import java.util.*;
public class MoveAllZero {
    public static void main(String[] args) {
        int[] arr = {0,2,3,0,7,4,3,2,0};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            boolean a = true;
            for (int j=0;j<n-1-i;j++){
                if(arr[j]==0){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    a = false;
                }
            }
            if(a)
                break;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }

    }
}
