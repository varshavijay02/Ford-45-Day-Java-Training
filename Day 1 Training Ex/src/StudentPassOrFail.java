import java.util.Scanner;

public class StudentPassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0;
        int failCount=0;
        int marks;

        System.out.println("Enter 6 subject marks:");

        while(i<6){
            marks = sc.nextInt();
            if(marks<45){
                failCount++;
            }
            i++;
        }

        String[] numWords = {"zero","one","two","three","four","five","six"};

        if(failCount==0) System.out.println("Student Passed!");
        else System.out.println("Student failed in "+numWords[failCount]+" subjects");
    }
}

//develop an application to read 6 subjects marks of a student and find out he is passed or failed.
// the pass mark for each subject is 45.
//        (use while loop)
//
//Input:-
//Enter 6 subject marks:
//        40
//        50
//        60
//        70
//        42
//        60
//
//Output:-
//Student failed in two subjects

