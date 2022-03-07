
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        int giftValue = Integer.valueOf(scan.nextLine());
        if(giftValue > 1000000){
            int diff = giftValue - 1000000;
            double taxRate = diff * 0.17;
            double total = taxRate + 142100;
            System.out.println("Tax: " + total);
        }else if(giftValue >= 200000 && giftValue <= 1000000){
            int diff = giftValue - 200000;
            double taxRate = diff * 0.15;
            double total = taxRate + 22100;
            System.out.println("Tax: " + total);
        }else if(giftValue >= 55000 && giftValue <= 200000){
            int diff = giftValue - 55000;
            double taxRate = diff * 0.12;
            double total = taxRate + 4700;
            System.out.println("Tax: " + total);
        }else if(giftValue >= 25000 && giftValue <= 55000){
            int diff = giftValue - 25000;
            double taxRate = diff * 0.10;
            double total = taxRate + 1700;
            System.out.println("Tax: " + total);
        }else if(giftValue >= 5000 && giftValue <= 25000){
            int diff = giftValue - 5000;
            double taxRate = diff * 0.08;
            double total = taxRate + 100;
            System.out.println("Tax: " + total);
        }else{
            System.out.println("No tax!");
        }
    }
}
