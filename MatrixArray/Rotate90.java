package MatrixArray;

public class Rotate90 {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {4, 5, 6},
                       {7, 8, 9}};
        for(int i=0; i<arr.length/2 + 1;i++){
            for(int j=i+1; j<arr[0].length;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }

        }
        for(int col=0;col<arr.length;col++){
            int i=0; int j= arr[0].length - 1;
            while(i<j) {
                int temp = arr[i][col];
                arr[i][col] = arr[j][col];
                arr[j][col] = temp;
                i++;
                j--;
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
