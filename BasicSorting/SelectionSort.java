package BasicSorting;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr ={3,4,6,2,8,1,2,5,2,3,0};
        int n = arr.length;
        for(int i =0;i<n-1;i++){
            int min = Integer.MAX_VALUE;
            int k =-1;
            for(int j =i;j<n;j++){
                if(arr[j]<min){
                    min = arr[j];
                    k=j;
                }
            }
            int temp = arr[k];
            arr[k] = arr[i];
            arr[i]= temp;
        }
        for(int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
