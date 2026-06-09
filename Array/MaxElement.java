package Array;
import java.util.Scanner;
public class MaxElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter the elements:");
        for (int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int max = arr[0];
        for (int i  = 0;i<n;i++){
            if(arr[i]>max)
                max = arr[i];
        }
        System.out.println("Max element is: "+max);
























//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enetr size of array:");
//        int n = sc.nextInt();
//        int[] arr = new int[n];
//        System.out.print("Enetr elements: ");
//        for (int i=0; i<n;i++){
//            arr[i] = sc.nextInt();
//        }
//        int max = arr[0];
//        for (int i=1;i<n;i++){
//            if (arr[i]> max)
//                max = arr[i];
//
//        }
//        System.out.println("Max element in the array:"+max);
    }
}
