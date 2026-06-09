package BasicSorting;

import java.util.Scanner;

public class FloorInSortedArray {
    public static void main(String[] args) {
        int[] arr = {4, 15, 17, 17, 19, 20, 21, 22, 22, 25, 26, 26, 26, 28, 28, 28 ,31 ,31 ,32 ,33, 34, 34 ,35 ,36, 36, 37, 38, 38, 39, 41, 41 ,42, 43 ,43 ,44 ,44, 45 ,45 ,46 ,47 ,49, 49, 50, 50, 50, 51 ,53 ,54 ,54 ,56 ,57 ,58 ,58 ,59 ,60 ,64 ,67 ,69 ,75 ,94
                ,26};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to obtain the index of a number highest smaller it or equal:");
        int n = sc.nextInt();
        int l = 0;
        int h = arr.length - 1;
        int idx = -1;
        while (l <= h) {
            int mid = (l + h) / 2;
            if (arr[mid] == n) {
                idx = mid;
                l = mid+1;
            } else if (arr[mid] > n) {
                h = mid - 1;
            } else {
                idx = mid;
                l = mid + 1;
            }

        }
        System.out.print("Result=" + idx);
    }
}