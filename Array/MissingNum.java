package Array;
import java.util.Scanner;
public class MissingNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int num = arr.length + 1;
        int s1 = num*(num+1)/2;
        int s2=0;
        for (int i=0;i<n;i++){
            s2 = s2 + arr[i];
        }
        int MissArr = s1 - s2;
        System.out.print("The missing Number in the array is: "+MissArr);

    }
}