package ex_015_Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab0148_2D_RightTriangle_IQ {
    public static void main(String[] args) {
        //Pattern we want
        //n=3
        //*
        //**
        //***
        //  i,j        i,j
        //1,0,0 -> * = j<i
        //2,0,1 ->   = j>i ---we dont want this
        //3,0,2 ->   = j>i ---we dont want this

        //4,1,0 -> *  = j<i
        //5,1,1 -> *  = j<=i
        //6,1,2  ->   = j>i ---we dont want this

        //7,2,0 -> *  = j<i
        //8,2,1 -> *  = j<i
        //9,2,2 -> *  = j<=i

        //Use SCanner class input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number n=3");
        int n =scanner.nextInt();

        for(int i = 0; i < n; i++) {//row - n
            for (int j = 0; j<=i; j++){ // just find out which j condition fulfills using 3x3 condition matrix logic
                System.out.print("*");

            }
            System.out.println(" ");//for each row and column we get space
            //Enter the number n=3/any number
            //5
            //*
            //**
            //***
            //****
            //*****

        }


    }
}
