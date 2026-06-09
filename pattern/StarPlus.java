package pattern;
import java.util.Scanner;
public class StarPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER r:");
        int r = sc.nextInt();
        System.out.print("ENTER c:");
        int c = sc.nextInt();
        int mid = (c/2)+1;
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if (i==mid || j== mid)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}