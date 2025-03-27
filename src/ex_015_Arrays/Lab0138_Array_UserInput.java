package ex_015_Arrays;

import java.util.Scanner;

public class Lab0138_Array_UserInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of the vlaue");
        int size = sc.nextInt();

        int [] number_marks = new int[size];
        for(int i =0; i<number_marks.length; i++) {
            System.out.println("Enter the numbers");
            number_marks[i] = sc.nextInt(); //keep on storing the elements

        }
        System.out.println("-------");

        for(int i=0;i<number_marks.length;i++) {
            System.out.println(number_marks[i]);

        }
        sc.close();
    }
}
