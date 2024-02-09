import java.util.Scanner;

public class DiscoutCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Price of item 1 : ");
        float item1Price = sc.nextFloat();
        System.out.print("Price of item 2 : ");
        float item2Price = sc.nextFloat();
        System.out.print("Discount in percentage : ");
        int discount = sc.nextInt();

        float totalAmount = item1Price+item2Price;
        System.out.println("Total amount : $"+totalAmount);

        float amountDiscounted = (float) (discount/100.0)*totalAmount;
        float discountedAmount = (float) (totalAmount-amountDiscounted);
        System.out.println("Discounted amount : $"+String.format("%.2f",discountedAmount));
        System.out.println("Saved amount : $"+String.format("%.2f",amountDiscounted));
    }
}
//Calculate the discount based on the price of two items and the overall discount percentage.
//Input Format:
//        1. Item 1 price as floating point
//        2. Item 2 price as floating point
//        3. Discount as integer
//Output Format:
//        1. Total of Item 1 and Item 2
//        2. Price after discount (correct to 2 decimal places)
//        3. Amount discounted (correct to 2 decimal places)
//
//Sample Input and Output Format:
//All text in bold corresponds to input and the rest corresponds to output.
//Sample Input and Output:
// Price of item 1 : 20.50
// Price of item 2 : 45.40
// Discount in percentage : 10
// Total amount : $65.90
// Discounted amount : $59.31
// Saved amount : $6.59
