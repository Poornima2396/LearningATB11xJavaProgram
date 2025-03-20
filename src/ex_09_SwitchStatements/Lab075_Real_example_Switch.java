package ex_09_SwitchStatements;

import java.util.Scanner;

public class Lab075_Real_example_Switch {
    public static void main(String[] args) {
       //Web Automation
        //I will ask the user to give me the input from browser
        // which he wants to use to start the automation in that browser

        //Method 1
      //  String browser = args[0]; //whatever CLI input you are giving,
        // it gets assigned to browser in line number 9
      //  System.out.println(browser); //output- chrome -> entered in CLI

        //Method 2 - USe either one of them, both cannot be used
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();

        //now write switch statement for browser

        switch (browser) {
            case "chrome":              //case sensitive
                System.out.println("Starting the chrome");
                System.out.println(".........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");
                break;
            case "edge":
                System.out.println("Starting the edge");
                break;
            default:
                System.out.println("I have no idea about the browser");
                break;

        }


    }
}
