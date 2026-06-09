package MatrixArray;

public class MInofMaxEleRow {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3, 4}, {0, 1, 0, 1}, {2, 2, 2, 2}};
        int min = Integer.MAX_VALUE;
        for( int i=0;i<arr.length;i++){
            int max =0;
            for(int j =0; j<arr[i].length;j++){
                if(arr[i][j]>max){
                    max = arr[i][j];
                }
            }
            if(max<min){
                min = max;
            }
        }
        System.out.println("Min elements of the Max ele of Rows: "+min);
    }
}
