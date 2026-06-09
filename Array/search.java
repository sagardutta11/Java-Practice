package Array;
import java.util.Scanner;
public class search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search: ");
        int s = sc.nextInt();
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s == arr[i]) {
                count++;
                System.out.print("Found!! its in index " + i);
            }
        }
                if (count == 0)
                    System.out.println("Not found");

        }
    }
