package MatrixArray;

public class SetZeros {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {0, 5, 6},
                       {7, 8, 9}};
        int[][] krr = new int[arr.length][arr[0].length];
        for (int i=0;i< arr.length;i++){
            krr[i] = arr[i].clone();
        }
        for(int i = 0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==0){
                    int m=0;int n=0;
                    while(m<arr.length && n< arr[0].length){
                        krr[i][m] = 0;
                        m++;
                        krr[n][j] = 0;
                        n++;
                    }
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j = 0;j<arr[0].length;j++){
                System.out.print(krr[i][j]+" ");
            }
            System.out.println("");
        }
    }
}
