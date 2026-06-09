package BasicSorting;

public class OptimisedBubble {
    public static void main(String[] args) {
        int[] arr = {1,2,3,8,7,4,3,2,0};
        int n = arr.length;
        for(int i=0;i<n-1;i++){
            int a = 0;
            for(int j=0;j<n-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    a++;
                }
            }
            if(a==0){
                break;}
        }
        for (int ele: arr){
            System.out.print(ele+" ");
        }
    }
}
