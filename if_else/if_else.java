package src.if_else;
import java.util.Scanner;
public class if_else{
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
    int n = sc.nextInt();
    if(n%2==0)
        System.out.println(n+" is a even number");
    else
        System.out.println(n+" is a odd number");

    }
}

