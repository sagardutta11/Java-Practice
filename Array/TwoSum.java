package Array;
import java.util.Scanner;
public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element you want to search for 2 sum: ");
        int x = sc.nextInt();
        int s = 0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if ( x == arr[i]+arr[j]) {
                    System.out.print("output: " + arr[i] + " and " + arr[j]);
                    s++;
                }
                if(s>0)
                    break;
            }
            if(s>0)
                break;
        }
        if(s==0)
            System.out.println("No such elements exist. ");
}
}
