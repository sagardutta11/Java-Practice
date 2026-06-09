package pattern;
import  java.util.Scanner;
public class p1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n terms:");
        int n = sc.nextInt();
        //ABCD
//        for (int i=1;i<=n;i++){
//            for (int j = 65; j<n+65;j++){
//                System.out.print((char)j+ " ");
//            }
//            System.out.print("\n");
//        }
        for (int i=1;i<=n;i++){
            for (int j = 97; j<n+97;j++){
                System.out.print((char)j+ " ");
            }
            System.out.print("\n");
        }

    }
}
