package MatrixArray;

public class rowMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {0, 1, 0, 1}, {2, 2, 2, 2}};
        int r = arr.length;
        int c = arr[0].length;
        int max = 0;
        int row = 0;
        for (int i = 0; i < r; i++) {
            int sum = 0;
            for (int j = 0; j < c; j++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
                row = i;
            }

        }
        System.out.print("MAX sum of elements in row:" + max + " OF Row:" + row);
    }
}