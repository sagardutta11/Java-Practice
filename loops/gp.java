package loops;
import java.util.Scanner;
public class gp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first term 'a' :");
        int a = sc.nextInt();
        System.out.print("Enter differnce 'r' :");
        int r = sc.nextInt();
       System.out.print("Enter number of terms: ");
       int n = sc.nextInt();
        for (int i = 1;i<=n;i++) {
            System.out.print(a+" ");
            a *= r;
        }
    }
}