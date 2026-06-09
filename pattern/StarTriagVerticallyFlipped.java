package pattern;
import java.util.Scanner;
public class StarTriagVerticallyFlipped {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms:");
        int n = sc.nextInt();

        //method 1
//        for (int i=1;i<=n;i++){
//            for (int j=1;j<=n;j++){
//                if ( (i+j) > n)
//                    System.out.print("* ");
//                else
//                    System.out.print("  ");
//            }
//            System.out.println();
//        }
//      #method 2
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n-1;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
