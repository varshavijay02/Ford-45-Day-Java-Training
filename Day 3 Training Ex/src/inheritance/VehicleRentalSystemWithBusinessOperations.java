package inheritance;

class Vehicle {
    String make;
    String model;
    double rentalPrice;
    boolean rented;

    Vehicle(String make, String model, double rentalPrice) {
        this.make = make;
        this.model = model;
        this.rentalPrice = rentalPrice;
        this.rented = false;
    }

    void rent() {
        if (!rented) {
            rented = true;
            System.out.println("Vehicle rented: " + make + " " + model);
        } else {
            System.out.println("Vehicle is already rented.");
        }
    }

    double calculateRentalCost(int days) {
        // Simple calculation for demonstration purposes
        return rentalPrice * days;
    }

    void returnVehicle() {
        if (rented) {
            rented = false;
            System.out.println("Vehicle returned: " + make + " " + model);
        } else {
            System.out.println("Vehicle is not currently rented.");
        }
    }
}

class Car extends Vehicle {
    // Specific features for cars
    // Implementation...
    int numOfSeats;
    Car(String make, String model, double rentalPrice, int numOfSeats) {
        super(make, model, rentalPrice);
        this.numOfSeats = numOfSeats;
    }
}

class Motorcycle extends Vehicle {
    // Specific features for motorcycles
    // Implementation...
    String type;
    Motorcycle(String make, String model, double rentalPrice, String type) {
        super(make, model, rentalPrice);
        this.type = type;
    }
}

class Truck extends Vehicle {
    // Specific features for trucks
    // Implementation...
    double cargoCapacity;
    Truck(String make, String model, double rentalPrice, double cargoCapacity) {
        super(make, model, rentalPrice);
        this.cargoCapacity = cargoCapacity;
    }
}


public class VehicleRentalSystemWithBusinessOperations {
    public static void main(String[] args) {
//      Creating instances of different vehicle types with varying attributes:

        Car sedan = new Car("Toyota", "Camry", 50.0, 7);
        Motorcycle sportBike = new Motorcycle("Harley-Davidson", "Sportster", 30.0, "Sport");
        Truck deliveryTruck = new Truck("Ford", "F-150", 80.0, 1000.0);

//      Performing business operations:
//      Renting a vehicle
        sedan.rent();

//      Calculating rental cost
        double rentalCost = sedan.calculateRentalCost(3);
        System.out.println("Rental cost: $" + rentalCost);

//      Returning a rented vehicle
        sedan.returnVehicle();


    }
}

///Problem Statement 3: Vehicle Rental System with Business Operations
//Build a vehicle rental system where there are different types of vehicles, including Cars, Motorcycles, and Trucks. Implement an inheritance hierarchy to model the relationships between the generic Vehicle class and its specialized subclasses, considering features specific to each type. Additionally, introduce business operations such as renting a vehicle, calculating rental cost, and returning a rented vehicle.
//
//Requirements:
//Design a base class "Vehicle" with properties like make, model, and rentalPrice.
//Implement subclasses for Cars, Motorcycles, and Trucks, each with type-specific features.
//Introduce business operations such as renting a vehicle, calculating rental cost based on the duration, and returning a rented vehicle.
//Ensure that the code allows for easy addition of new vehicle types without modifying existing code.
//Sample Code Stub:
//
//class Vehicle {
//    String make;
//    String model;
//    double rentalPrice;
//    boolean rented;
//
//    Vehicle(String make, String model, double rentalPrice) {
//        this.make = make;
//        this.model = model;
//        this.rentalPrice = rentalPrice;
//        this.rented = false;
//    }
//
//    void rent() {
//        if (!rented) {
//            rented = true;
//            System.out.println("Vehicle rented: " + make + " " + model);
//        } else {
//            System.out.println("Vehicle is already rented.");
//        }
//    }
//
//    double calculateRentalCost(int days) {
//        // Simple calculation for demonstration purposes
//        return rentalPrice * days;
//    }
//
//    void returnVehicle() {
//        if (rented) {
//            rented = false;
//            System.out.println("Vehicle returned: " + make + " " + model);
//        } else {
//            System.out.println("Vehicle is not currently rented.");
//        }
//    }
//}
//
//class Car extends Vehicle {
//    // Specific features for cars
//    // Implementation...
//}
//
//class Motorcycle extends Vehicle {
//    // Specific features for motorcycles
//    // Implementation...
//}
//
//class Truck extends Vehicle {
//    // Specific features for trucks
//    // Implementation...
//}
//
//Sample Input:
//Creating instances of different vehicle types with varying attributes:
//
//Car sedan = new Car("Toyota", "Camry", 50.0);
//Motorcycle sportBike = new Motorcycle("Harley-Davidson", "Sportster", 30.0);
//Truck deliveryTruck = new Truck("Ford", "F-150", 80.0);
//
//Performing business operations:
//// Renting a vehicle
//sedan.rent();
//
//// Calculating rental cost
//double rentalCost = sedan.calculateRentalCost(3);
//System.out.println("Rental cost: $" + rentalCost);
//
//// Returning a rented vehicle
//sedan.returnVehicle();
