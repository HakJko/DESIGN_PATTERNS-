package edu.patterns.ik;

import edu.patterns.ik.factory.Developer;
import edu.patterns.ik.factory.DeveloperFactory;
import edu.patterns.ik.factory.impl.JavaDeveloperFactory;
import edu.patterns.ik.factory.impl.PhpDeveloperFactory;

import java.util.Scanner;

public class FactoryMethodMain {
    public static void main(String[] args) {
        System.out.println("        ========== Program is running! ==========        ");
        chooseSpecialty();
        System.out.println("        ========== Thank you, please contact us again! ==========        ");
    }

    private static void processingChoice(String specialty) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty(specialty);
        Developer developer = developerFactory.createDeveloper();

        developer.writesCode();
    }

    private static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        switch (specialty.toLowerCase()) {
            case "java":
                return new JavaDeveloperFactory();
            case "php":
                return new PhpDeveloperFactory();
            default:
                throw new RuntimeException(specialty + " is unknown!");
        }
    }

    private static void chooseSpecialty() {
        System.out.println("Please select the programming language in which you need to write the program!");
        System.out.println("JAVA or PHP");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        String specialty = scanner.next();
        processingChoice(specialty);
    }
}
