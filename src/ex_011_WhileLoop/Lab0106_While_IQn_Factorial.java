package ex_011_WhileLoop;

import java.util.Scanner;

public class Lab0106_While_IQn_Factorial {
    public static void main(String[] args) {
        //FActorial program
        //using for and while loop
        //factorial of 0 or less than 0 is 1
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the factorial program\n Enter the number whose factorial you want.?");
        int number = scanner.nextInt();

        int factorial = 1; //it cannot be 0
        if(number<1) {  // //factorial of 0 or less than 0 is 1
            System.out.println(factorial); //1
        } else {
            for(int i=1; i<=number; i++) {
                factorial = factorial*i;

            }
        }
        System.out.println("factorial is: " +factorial);
    }
}
