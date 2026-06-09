package pattern;
import java.util.Scanner;
public class DIamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms:");
        int n = sc.nextInt();
        for (int i = 1; i <=n; i++) {
                for (int j = i; j <= n - 1; j++) {
                    System.out.print("  ");
                }
                for (int j = 1; j <= 2 * i - 1; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        int k = 1;
        int s = n-1;
        for (int i =1 ;i <=s;i++){
            for(int j =1;j<=i;j++){
                System.out.print("  ");
            }
                for (int j =k; j<=2*s-1;j++){
                    System.out.print("* ");
                }
                k +=2;
            System.out.println();
            }
        }
        }

