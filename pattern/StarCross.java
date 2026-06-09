package pattern;
import java.util.Scanner;
public class StarCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER r:");
        int r = sc.nextInt();
        int n = r+1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= r; j++) {
                if (i+j==n || i==j)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}
