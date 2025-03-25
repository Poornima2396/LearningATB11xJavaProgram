package Tasks_Java;

import java.util.Scanner;

public class Task08_EvenOdd {
    public static void main(String[] args) {
        //Create a program
        //take a user input
        //check whether the input is even or odd

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        //int number2 = Integer.parseInt(args[0]);

        if(number%2 ==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("odd");
        }


    }
}
