package loops;
import java.util.Scanner;
public class rev_orig_sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int num = sc.nextInt();
        int n = num;
        int rev = 0;
        while (num!=0){
            rev *= 10;
            rev += num%10;
            num = num/10;

        }
        int s = rev + n;
        System.out.println("Original Num:"+n);
        System.out.println("Reversed Num:"+rev);
        System.out.println("Sum of reverse and original is: "+ s);
    }
}
