package ex_08_if_Condition;

import java.util.Scanner;

public class Lab071_Scannerclass_If_Else_Condition03 {
    public static void main(String[] args) {
        //How to take user inputs
        //1.CLI Options
       // int age = Integer.parseInt(args[0]);
        //2.Scanner class-u can use the class with the name Scanner
        //which is present in java.util
//Either u will use CLI option or Scanner option
        Scanner scanner = new Scanner(System.in); //oops concept
        System.out.println("Enter your age"); //enter age 12 then it gets stored
        int age = scanner.nextInt();
        System.out.println(age);//12
        //new -> creates new Instance
        //Syste.in -> get everything from input
        //u can get next integer
        //it will store the value when you enter

        //if loop
        if (age>18) {
            System.out.println("Allowed to vote");
        } else {
            System.out.println("not allowed to vote");
        }



    }
}
