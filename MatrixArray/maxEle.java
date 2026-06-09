package MatrixArray;

public class maxEle {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},{0,1,0,1},{2,2,2,2}};
        int r = arr.length;
        int c = arr[0].length;
        int max = arr[0][0];
        for( int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]>max)
                    max = arr[i][j];
            }
            for (int ele : arr[i]){
                System.out.print(ele+" ");

            }
            System.out.println();
        }
        System.out.println("Max element:"+max);
    }





    }

