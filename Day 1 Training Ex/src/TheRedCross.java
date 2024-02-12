import java.util.Scanner;

public class TheRedCross {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int noOfCamps = sc.nextInt();

        // ARRAY TO STORE CITIZEN COUNT IN 1 CAMP
        int[] noOfCitizensIn1Camp = new int[noOfCamps];


        int totalCitizenCount = 0;
        // FOR LOOP (1 and 3)
//        for (int i=0;i<noOfCamps;i++){
//            noOfCitizensIn1Camp[i] = sc.nextInt();
//            totalCitizenCount+=noOfCitizensIn1Camp[i]; // (1)
//        }

        // WHILE LOOP (2)
        int i=0;
        while(i<noOfCamps){
            noOfCitizensIn1Camp[i] = sc.nextInt();
            totalCitizenCount+=noOfCitizensIn1Camp[i];
            i++;
        }

        // FOR-EACH LOOP (3)
//        for(int citizenCount: noOfCitizensIn1Camp){
//            totalCitizenCount+=citizenCount;
//        }

        System.out.println(totalCitizenCount);

    }
}

//On an event of a natural calamity, Red Cross is responsible to present the accurate details of the number of people who were rescued and sought refuge in the camps.
//Write a program to facilitate Red Cross authorities record the total number of refugees from each tent of the camps given the number of tents.
//1. Note (for loop):
//· Use integer array to store the number of refugees present in each tent.
//· Use for loop to store people count in tent and calculate the total number of people.

//2. Note (while loop):
//· Use integer array to store the number of refugees present in each tent.
//· Use while loop to store people count in tent and calculate the total number of people.

//3. Note (for-each loop):
//· Use integer array to store the number of refugees present in each tent.
//· Use for loop to store people count in tent.
//· Use separate enhanced for loop to calculate the total number of people.

//Input Format:
//First line of the input is an integer value that corresponds to the number of tents in the camp.
// The next n lines of input contains the number of refugees staying in each of the tents.
//
//Output Format:
//Output should print the total number of citizens present in the camp. Refer sample input and output for formatting specifications.
//All text in bold corresponds to input and the rest corresponds to output.
//Note: Code submission not required. To be implemented using eclipse IDE and manually verified by the SME.
//Sample Input and Output:
// 5
// 10 12 30 12 12
// 76
