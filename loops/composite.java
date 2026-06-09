package loops;
import java.util.Scanner;
public class composite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int count = 0;
        for (int i=2;i<n;i++) {
            if (n % i == 0) {
                System.out.print("Its a composite number");
                count++;
                break;
            }
        }
        if(count==0){
            System.out.println("Its a prime number");
        }

    }
}
