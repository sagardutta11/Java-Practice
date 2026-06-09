package Array;
import java.util.Scanner;
public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int sw = arr.length/2;
        int i =0;
        int j =1;
        int s = 0;
        while(s!= sw){
            swap(arr,i,j);
            i +=2;
            j +=2;
            s++;
        }
        System.out.print("Wavy Array: ");
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
    static void swap(int[] arr,int i,int j){
       int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;

    }
}
