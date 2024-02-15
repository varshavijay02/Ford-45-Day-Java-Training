package encapsulation;

class Student {
    private String name;
    private int studentId;
    private int[] grades;

    // Constructor and methods for setting and getting details

    public Student(String name, int studentId, int[] grades) {
        this.name = name;
        this.studentId = studentId;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    // Calculate average grade method
    double calculateAverageGrade(){
        int sumGrades = 0;
        for(int grade : grades){
            sumGrades+=grade;
        }
        return (double) sumGrades / grades.length;
    }
}


public class AvgGradeOfStudent {
    public static void main(String[] args) {
        // Sample Usage
        Student student = new Student("Alice", 12345, new int[]{85, 90, 78});
//        System.out.println(String.format("Average Grade: %.2f",student.calculateAverageGrade()));
        System.out.println("Average Grade: " + student.calculateAverageGrade());
    }
}

//Problem Statement-1:
//
//Create a Student class encapsulating student details like name, ID, and grades. Implement methods to calculate the average grade. Ensure that grades are within a valid range (0-100).
//
//Requirements:
//
//The Student class should have private fields for name, ID, and an array of grades.
//Implement methods for setting and getting student details, as well as calculating the average grade.
//
//Ensure that grades are within the valid range of 0 to 100.
//
//Sample code:-
//
//public class Student {
//    private String name;
//    private int studentId;
//    private int[] grades;
//
//    // Constructor and methods for setting and getting details
//    // Calculate average grade method
//}
//
//// Sample Usage
//Student student = new Student("Alice", 12345, new int[]{85, 90, 78});
//System.out.println("Average Grade: " + student.calculateAverageGrade());
