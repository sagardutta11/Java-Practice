package src.if_else;
import  java.util.Scanner;
public class absoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n = sc.nextInt();
        if (n<=0) n = -n;
        System.out.println(n);
    }
}
