package BasicSorting;

import java.util.Scanner;

public class FirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,4,4,5,5,6,6,6,6};
        int l = 0; int h = arr.length - 1;
        System.out.print("Enter no.to search:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx = -1;
        while(l<h){
            int mid = (l+h)/2;
            if(arr[mid]>n){
                h = mid - 1;
            }
            else if(arr[mid]<n){
                l = mid+1;

            }
            else{
                idx = mid;
                h = mid;
            }
        }
        System.out.print("First ocurrance of the given no. is:"+idx);
    }

}
