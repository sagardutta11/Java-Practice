package src.if_else;
import java.util.Scanner;
public class Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        double n = sc.nextDouble();
        double x = (int)n;
        if (n-x == 0) System.out.println("Is an integer"); //or if(n-(int)n == 0)
        else System.out.println("Not an Integer");

        }
        }
