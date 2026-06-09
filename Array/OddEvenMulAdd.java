package Array;
import java.util.Scanner;
public class OddEvenMulAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Original array: ");
        print(arr);
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0)
                arr[i] += 10;
            else
                arr[i] *= 2;
        }
        System.out.print("New array: ");
        print(arr);
        }
    public static void print( int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
