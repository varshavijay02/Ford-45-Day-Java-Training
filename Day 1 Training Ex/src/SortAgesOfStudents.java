import java.util.Arrays;
import java.util.Scanner;

public class SortAgesOfStudents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ages[] = new int[6];

        System.out.println("Enter 6 student ages:");
        for(int i=0;i<6;i++){
            ages[i] = sc.nextInt();
        }

//        Arrays.sort(ages);

        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(ages[i]>ages[j]){
                    int t = ages[i];
                    ages[i] = ages[j];
                    ages[j] = t;
                }
            }
        }

        System.out.println("Students ages ( younger to older ):");
        for(int i=0;i<6;i++){
            System.out.println(ages[i]);
        }

        for(int i=0;i<6;i++){
            for(int j=i+1;j<6;j++){
                if(ages[i]<ages[j]){
                    int t = ages[i];
                    ages[i] = ages[j];
                    ages[j] = t;
                }
            }
        }

        System.out.println("Students ages (Older to younger):");
        for(int i=0;i<6;i++){
            System.out.println(ages[i]);
        }

    }
}
//Develop an application to read the ages of 6 students randomly.....
// and arrange the ages in ascending order and descending order. (use arrays)
//
//Input:-
//Enter 6 student ages:
//25
//24
//16
//19
//20
//23
//
//Output:-
//Students ages ( younger to older ):
//16
//19
//20
//23
//24
//25
//
//Students ages (Older to younger):
//25
//24
//23
//20
//19
//16
