package loops;
import java.util.Scanner;
public class ascii {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for  (int i = 65; i<=122;i++){
            System.out.println((char)i + " "+ i);
        }
    }
}

