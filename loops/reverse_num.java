package loops;
import java.util.Scanner;
public class reverse_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
//        while (n!=0){
//            int rev = n%10;
//            System.out.print(rev);
//            n = n/10;
//        }
        //2nd method
        int r = 0;
        while (n != 0){
            r *= 10;
            r += (n%10);
            n /= 10;

        }
        System.out.println(r);
    }
}
