package BasicSorting;

public class PeakInMountainArray {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,2,3,3,4,5,4,3,2,1,0};
        int l = 0; int h= arr.length;
        while(l<=h){
            int mid = (l+h)/2;
            if(arr[mid] > arr[mid+1]){
                h = mid-1;
            }
            else
                l =  mid+1;
        }
        System.out.print("The Peak element is:"+arr[l]);
    }
}
