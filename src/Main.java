import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double initPrice;
        double shippingCost;
        double finalPrice;

        System.out.print("Please enter your item's price: ");
        initPrice = scan.nextDouble();

        if (initPrice >= 100) {
            System.out.println("Your shipping is free!  Your total is $" + initPrice);
        } else {
            shippingCost =  initPrice * 0.02;
            finalPrice = initPrice + shippingCost;
            System.out.println("Your shipping will cost $" + df.format(shippingCost) + ".  Your total is $" + df.format(finalPrice));
        }
    }
}