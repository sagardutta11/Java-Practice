package MatrixArray;

public class ColumnElements {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4},
                       {0, 1, 0, 1},
                       {2, 2, 2, 2}};
        for(int i=0;i<arr[0].length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
}
