import java.util.Scanner;

public class SumOfOddPositions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 6 mobile prices:");
        int[] mobilePrices = new int[6];

        for(int i=0;i<6;i++){
            mobilePrices[i] = sc.nextInt();
        }

        int oddPositionstotalCost = 0;

        for(int i=1;i<6;i+=2){
            oddPositionstotalCost+=mobilePrices[i];
        }

        System.out.println("Sum of odd positions: "+oddPositionstotalCost);
    }
}
//Develop an application to read the 6 mobile prices and find out the total cost of odd positions.
//
//        Input:-
//
//Enter 6 mobile prices:
//        15
//        20
//        30
//        40
//        72
//        82
//
//Output:-
//
//Sum of odd positions:  142

