package MatrixArray;

public class SnakeMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4,5},
                {0, 1, 0, 1,22},
                {88, 12, 11, 7,8}};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (j < arr[0].length && j>=0) {
                if (i % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
//                    System.out.print("j="+j+" ");
                    j++;
                }
                else {
                    System.out.print(arr[i][j] + " ");
                    j--;
                }
            }
            j--;
            if(j==-2) {
                j+=2;
            }

        }

    }

}