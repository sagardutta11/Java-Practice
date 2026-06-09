package MatrixArray;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3},
                       {0, 5, 6},
                       {7, 8, 9}};
        int minr = 0; int maxr = arr.length-1;
        int minc = 0; int maxc = arr[0].length-1;
        int[] krr = new int[arr.length * arr[0].length];
        int k = 0;
        while( minr<= maxr && minc<=maxc){
            for(int j =minc;j<=maxc;j++){
                krr[k] = arr[minr][j];
                k++;
            }
            minr++;

            for(int i=minr;i<=maxr;i++){
                krr[k] = arr[i][maxc];
                k++;
            }
            maxc--;
            for(int j= maxc;j>=minc;j--){
                krr[k] = arr[maxr][j];
                k++;
            }
            maxr--;
            for(int i = maxr;i>=minr;i--){
                krr[k] = arr[i][minc];
                k++;
            }
            minc++;
        }
        for(int ele: krr){
            System.out.print(ele+" ");
        }

    }
}
