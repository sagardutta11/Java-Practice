package MatrixArray;

public class MatrixMul {
    public static void main(String[] args) {
        int[][] arr = {{1, 2},
                       {0, 5},
                      };
        int[][] krr = {{ 2, 3,5},
                      { 5, 6,7},
                    };
        int[][] prr = new int[arr.length][krr[0].length];
        if(arr[0].length == krr.length) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < krr[0].length; j++) {
                    for (int k = 0; k < arr[0].length; k++) {
                        prr[i][j] += arr[i][k] * krr[k][j];


                    }
                }
            }
        }
        for(int i = 0;i< prr.length;i++){
            for(int j = 0;j< prr[0].length;j++){
                System.out.print(prr[i][j]+" ");
            }
            System.out.println(" ");
        }
    }
}
