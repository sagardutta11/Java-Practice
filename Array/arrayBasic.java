package Array;
import java.util.Scanner;
public class arrayBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no.of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            System.out.print("Enter element "+(i+1)+":");
            arr[i] = sc.nextInt();
        }
        for (int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
