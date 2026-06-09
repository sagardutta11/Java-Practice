package MatrixArray;

public class SetMatrixZero {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                {0, 5, 6},
                {7, 8, 9}};
        int m= arr.length; int n= arr[0].length;
        boolean[] r = new boolean[m];
        boolean[] c = new boolean[n];
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                if(arr[i][j]== 0){
                    r[i] = true;
                    c[j] = true;
                }
            }
        }

        //rows
        for(int i=0;i<m;i++){
            if(r[i]){
                for (int j =0;j<n;j++){
                    arr[i][j] = 0;
                }
            }
        }
        //cols
        for(int j=0;j<n;j++){
            if(c[j]){
                for(int i=0;i<m;i++){
                    arr[i][j] = 0;
                }
            }
        }
        //print
        for(int i = 0;i<m;i++){
            for(int j = 0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");
        }

    }
}