package MatrixArray;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {0, 1, 0},
                       {2, 2, 2}};
        for(int i=0; i<arr.length/2 + 1;i++){
            for(int j=i+1; j<arr[0].length;j++){
                    int temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
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

