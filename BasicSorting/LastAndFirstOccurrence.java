package BasicSorting;

import java.util.Scanner;

public class LastAndFirstOccurrence {
    public static void main(String[] args) {
        int[] arr = {1,1,1,2,2,2,2,4,4,5,5,6,6,6,6};
        int l = 0; int h = arr.length - 1;
        System.out.print("Enter no.to search:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int idx1 = -1;
        int idx2 = -1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>n) h = mid-1;
            else if(arr[mid]<n) l = mid+1;
            else{
                idx1 = mid;
                h= mid-1;
            }
        }
        l = 0; h = arr.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid]>n)h = mid - 1;
            else if(arr[mid]<n)l = mid+1;
            else{
                idx2 = mid;
                l = mid+1;
            }
        }
        System.out.print("First and Last occurrence:"+idx1+" and "+idx2);
    }
}
