package MatrixArray;

import java.util.Scanner;

public class SearchMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. to search:");
        int n = sc.nextInt();
        int count=0;
    for(int i = 0;i< arr.length;i++){
        for(int j = arr[0].length -1 ;j>=0;j--){
            if(arr[i][j]==n){
                System.out.print("Found");
                count++;
                break;
            }
            else if (n>arr[i][j]) {
                break;
            }
    if(count>0)
        break;
        }
    }



        }

    }

