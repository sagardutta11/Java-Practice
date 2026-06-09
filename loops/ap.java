package loops;
import java.util.Scanner;
public class ap {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter first term 'a' :");
       int a = sc.nextInt();
       System.out.print("Enter differnce 'd' :");
       int d = sc.nextInt();
//       System.out.print("Enter number of terms: ");
//       int n = sc.nextInt();
       for (int i = 1;a>0;i++) {
           System.out.print(a+" ");
           a -= d;
       }
    }
}
