package ArrayListJava;
import java.util.*;
public class AddingOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr1 = new ArrayList<>();
        System.out.print("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int carry = 1;
        for (int i = arr.length-1;i>=0;i--){
            if(arr[i]+carry<=9) {
                arr1.add(arr[i] + carry);
                carry = 0;
            }
            else{
                arr1.add(0);
                carry=1;

            }
        }
        if(carry==1)
            arr1.add(1);
        Collections.reverse(arr1);

//        int carry = 0;
//        for (int i = n - 1; i >= 0; i--) {
//
//            if (carry == 1) {
//                if (arr.get(i) < 9) {
//                    arr.set(i, arr.get(i) + 1);
//                    break;
//                }
//                else {
//                    if (i != 0)
//                        arr.set(i, 0);
//                    else {
//                        arr.set(i, 0);
//                        arr.add(i,1);
//                        carry = 1;
//                    }
//                }
//
//            }
//
//            else if (arr.get(i) < 9){
//                arr.set(i, arr.get(i) + 1);
//            break;
//        }
//                else if (arr.get(i) == 9) {
//                    arr.set(i, 0);
//                    carry = 1;
//                }
//
//            }
        System.out.print("Array = ");
        for (int ele: arr1){
            System.out.print(ele+" ");
        }
        }
    }
