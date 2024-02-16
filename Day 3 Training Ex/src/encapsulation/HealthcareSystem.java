package encapsulation;

class Patient {
    private String name;
    private int age;
    private String[] medicalHistory;

    private static int length = 0;

    // Constructor and methods for setting and getting details

    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        medicalHistory = new String[10];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String[] getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String[] medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Method to update medical history
    void updateMedicalHistory(String medicalInfo){
        medicalHistory[length++] = medicalInfo;
//        System.out.println(medicalInfo+" "+ medicalHistory[length-1]);
    }
    // Method to display patient information
    void displayPatientInfo(){
        System.out.println(name+"'s Patient Information:");
        for(int i=0;i<length;i++){
            System.out.println(medicalHistory[i]);
        }
    }
}


public class HealthcareSystem {
    public static void main(String[] args) {
        // Sample Usage
        Patient patient = new Patient("Mary", 35);
        patient.updateMedicalHistory("Allergies: None");
        patient.displayPatientInfo();
    }
}

//Problem 4: Healthcare System
//
//Design a Patient class encapsulating patient details like name, age, and medical history. Implement methods to update medical history and display patient information.
//
//Requirements:
//
//The Patient class should have private fields for name, age, and an array for medical history.
//Implement methods to update the medical history and display patient information.
//
//Sample Code Stub:
//
//public class Patient {
//    private String name;
//    private int age;
//    private String[] medicalHistory;
//
//    // Constructor and methods for setting and getting details
//    // Method to update medical history
//    // Method to display patient information
//}
//
//
//// Sample Usage
//Patient patient = new Patient("Mary", 35);
//patient.updateMedicalHistory("Allergies: None");
//patient.displayPatientInfo();
