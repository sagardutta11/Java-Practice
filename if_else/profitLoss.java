package src.if_else;
import java.util.Scanner;
public class profitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter cost price: ");
        double cp = sc.nextDouble();
        System.out.print("Enter selling price: ");
        double sp = sc.nextDouble();
        if (sp > cp) {
            System.out.println("Profit is " + (sp - cp));
            double percen = ((sp - cp) / cp) * 100;
            System.out.println("Profit Percentage = " + percen);
        } else if (sp == cp) {
            System.out.println("No profit no Loss");
        } else {
            System.out.println("Loss is " + (cp - sp));
            double percen = ((cp - sp) / sp) * 100;
            System.out.println("Profit Percentage = " + percen);
        }
    }
}
//https://drive.google.com/drive/folders/1gW-fw94UfDCbb-e4k39QOWrwntbzF7UC?usp=sharing

//https://drive.google.com/drive/folders/1gW-fw94UfDCbb-e4k39QOWrwntbzF7UC?usp=sharing