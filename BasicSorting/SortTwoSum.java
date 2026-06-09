package BasicSorting;
import java.util.*;
public class SortTwoSum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the sum:");
        int s = sc.nextInt();
        int[] arr ={3,4,6,2,8,1,2,5,2,3,0};
        int n = arr.length;
        Arrays.sort(arr);
        for(int ele: arr){
            System.out.print(ele+" ");
        }
        int i =0; int j = n-1;
        while(true){
            if(arr[i]+arr[j]== s) {
                System.out.println("Sum = " + arr[i] +" + "+ arr[j] + " in index " + i + " and " + j);
                break;
            }
            else {
                if (arr[i] + arr[j] > s) {
                    j--;
                } else
                    i++;
            }

        }
    }
}
