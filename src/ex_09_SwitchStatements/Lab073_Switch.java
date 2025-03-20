package ex_09_SwitchStatements;

import java.util.Scanner;

public class Lab073_Switch {
    public static void main(String[] args) {
        //Switch
        //Take a user input and tell them the day which they have told
        //1 to 7 -> 1 - Mon, 5 - Fri
        //8 ? -> Not allowed or error

        //take input from user by using CLI option
        //int day = Integer.parseInt(args[0]); //CLI option 1

        //Scanner option 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();

        //without break statement it will not go out and u will get wrong output

        switch (day){
            case 1:
            System.out.println("Sun");
            break;

            case 2:
            System.out.println("Mon");
            break;

            case 3:
            System.out.println("Tue");
            break;

            case 4:
            System.out.println("Wed");
            break;

            case 5:
            System.out.println("Thu");
            break;

            case 6:
            System.out.println("Fri");
            break;

            case 7:
            System.out.println("Sat");
            break;

            default:
                System.out.println("Invalid, day number");
                break;
        }


    }

}
