package BasicSorting;

import java.util.Scanner;

public class SearchInDecendingArray {
    public static void main(String[] args) {
        int[] arr = {8, 7, 6, 5, 4, 3, 2, 1, 0};
        int l = 0;
        int h = arr.length - 1;
        System.out.print("Enter no.to search:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = -1;
        while (l <= h) {
            int mid = (h + l) / 2;
            if (arr[mid] > n) l = mid + 1;
            else if (arr[mid] < n) h = mid - 1;
            else {
                idx = mid;
                break;
            }

        }
        System.out.print("Index:" + idx);
    }
}