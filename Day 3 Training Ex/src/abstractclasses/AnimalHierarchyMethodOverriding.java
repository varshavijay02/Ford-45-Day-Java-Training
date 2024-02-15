package abstractclasses;

import java.util.Scanner;

abstract class Animal {
    // Attributes: name, age
    String name;
    int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract void makeSound();
}
class Lion extends Animal {
    // Implement constructor and override makeSound() method using super keyword

    public Lion(String name,int age) {
        super(name,age);
    }

    @Override
    void makeSound() {
        System.out.println("Lion - Sound: Roar");
    }
}
class Elephant extends Animal {
    // Implement constructor and override makeSound() method using super keyword

    public Elephant(String name,int age) {
        super(name,age);
    }

    @Override
    void makeSound() {
        System.out.println("Elephant - Sound: Trumpet");
    }
}


public class AnimalHierarchyMethodOverriding {
    public static void main(String[] args) {
        // Instantiate Lion and Elephant objects, display attributes and the sound they make
        Scanner sc = new Scanner(System.in);

        System.out.println("For Lion:");
        System.out.print("Name = ");
        String lionName = sc.nextLine();
        System.out.print("Age = ");
        int lionAge = sc.nextInt();
        sc.nextLine();
        Lion lion = new Lion(lionName, lionAge);

        System.out.println("For Elephant:");
        System.out.print("Name = ");
        String elephantName = sc.nextLine();
        System.out.print("Age = ");
        int elephantAge = sc.nextInt();
        Elephant elephant = new Elephant(elephantName, elephantAge);

        lion.makeSound();
        elephant.makeSound();

    }
}

//Problem Statement 3: Animal Hierarchy with Method Overriding and Super Keyword
//Create an abstract class named "Animal" with attributes "name" and "age." Derive two classes, "Lion" and "Elephant," from the abstract class. Implement methods to display the sound each animal makes.
//
//Requirements:
//Define an abstract class "Animal" with attributes "name" and "age."
//Implement two classes, "Lion" and "Elephant," inheriting from "Animal."
//Include methods to display the sound each animal makes.
//
//Operations to Perform:
//Implement the "makeSound()" method in both "Lion" and "Elephant" classes, using method overriding.
//Use the super keyword to invoke the overridden methods from the parent class.
//Write a program to instantiate objects of each class and display their attributes and the sound they make.
//
//
//Sample Code Stub:
//javaCopy code
//abstract class Animal {
//// Attributes: name, age
//abstract void makeSound();
//}
// class Lion extends Animal {
//// Implement constructor and override makeSound() method using super keyword
//}
// class Elephant extends Animal {
// // Implement constructor and override makeSound() method using super keyword
//}
//public class Main {
//public static void main(String[] args) {
//// Instantiate Lion and Elephant objects, display attributes and the sound they make
//}
// }
//Sample Input:
//For Lion: Name = "Simba", Age = 5
//For Elephant: Name = "Dumbo", Age = 10
//Sample Output:
//Lion - Sound: Roar
//Elephant - Sound: Trumpet
