package Array;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {12,23,45,88,56};
        int temp1;
        int i = 0, j= arr.length -1;
        while(i!= j){
            temp1 = arr[i];
            arr[i] = arr[j];
            arr[j] = temp1;
            i++;
            j--;
        }
        System.out.print("Reversed array: ");
        for(int ele : arr)
            System.out.print(ele+" ");
    }
}
