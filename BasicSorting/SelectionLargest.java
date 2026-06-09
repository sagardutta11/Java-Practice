package BasicSorting;

public class SelectionLargest {
    public static void main(String[] args) {
        int[] arr ={3,4,6,2,8,1,2,5,2,3,0};
        int n = arr.length;
        for(int i =n-1;i>=0;i--){
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for(int j= i;j>=0;j--){
                if(arr[j]>max){
                    max = arr[j];
                    maxdx = j;
                }
            }
            int temp = arr[maxdx];
            arr[maxdx] = arr[i];
            arr[i] = temp;

        }
        for (int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
