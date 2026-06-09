package MatrixArray;
import java.util.ArrayList;
import java.util.Scanner;
public class PascalTriangle {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter no. of n:" );
    int n = sc.nextInt();
    for(int i=0;i<=n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(Comb(i,j)+" ");
        }
        System.out.println(" ");
    }





    }
    public static int Comb(int i, int j){
        return fact(i)/(fact(i-j)*fact(j));
    }
    public static int fact(int n){
        if (n<=1){
            return 1;
        }
        return n* fact(n-1);
    }
}
