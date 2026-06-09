package ArrayListJava;

import java.util.ArrayList;
import java.util.Scanner;

public class Pascal2 {
    public static void main(String[] args) {


        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            ArrayList<Integer> a = new ArrayList<>();
            for(int j = 0;j<=i;j++){
                a.add(0);
            }
            arr.add(a);
        }
        for(int i =0;i<n;i++){
            for(int j =0;j<=i;j++){
                if( j==0 || j==i){
                    arr.get(i).set(j,1);
                }
                else {
                    int s = arr.get(i-1).get(j) + arr.get(i-1).get(j-1);
                    arr.get(i).set(j,s);
                }
            }
        }
        System.out.println(arr);
    }
}
