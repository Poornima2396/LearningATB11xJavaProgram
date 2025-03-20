package ex_09_SwitchStatements;

import java.util.Scanner;

public class Lab074_Without_Default {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the day num(1 to 7)");
        int day = scanner.nextInt();
        //Scanner is a class

//If you are not using default and enter invalid input, it will not print anything
        switch (day) {
            case 1:
                System.out.println("Sun");
                break;

            case 2:
                System.out.println("Mon");
                break;


            }

        }
}
