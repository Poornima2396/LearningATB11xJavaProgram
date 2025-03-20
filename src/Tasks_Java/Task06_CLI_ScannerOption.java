package Tasks_Java;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Task06_CLI_ScannerOption {
    public static void main(String[] args) {

        // CLI Options
        //user inputs by taking arguments args
        // Take a user input - Name, Age and Salary and print them in the end.
        // Take a user input //2 numbers from the arguments and calculate the maximum
        // in between with ternary operator.
        Scanner scanner = new Scanner(System.in);
        //name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter you age: ");
        int age = scanner.nextInt();

        System.out.print("Enter your salary: ");
        double salary = scanner.nextDouble();

        //Print the collected information
        System.out.println("Name: " + name);
        System.out.println("age: " + age);
        System.out.println("salary: " + salary);

        //close the scanner
        scanner.close();
    }

}
