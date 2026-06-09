package ArrayListJava;
import java.util.*;
public class

AddingArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.print("Enter no. of elements of Array 1: ");
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n1; i++) {
            arr1[i] = sc.nextInt();
        }
        System.out.print("Enter no. of elements of Array 2: ");
        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n2; i++) {
            arr2[i] = sc.nextInt();
        }
        int carry = 0, j = n2-1;
        for (int i = n1-1;i>=0;i--){
                if (arr1[i] + arr2[j] + carry > 9) {
                    int digi = (arr1[i] + arr2[j] + carry) % 10;
                    arr.add(digi);
                    carry = 1;
                }
                else{
                    int digi = arr1[i] + arr2[j]+carry;
                    arr.add(digi);
                    carry = 0;
                }
                if(j>0)
                    j--;
                else
                    arr2[j] = 0;
        }
        Collections.reverse(arr);
        System.out.print("Array = ");
        for (int ele: arr){
            System.out.print(ele+" ");
        }

    }
}
