package ex_015_Arrays;

import java.util.Arrays;

public class Lab0136_Arrays_Printing {
    public static void main(String[] args) {

        int [] marks = {69, 87, 74, 58, 89, 90}; //Array - predefined elements

      //  System.out.println(marks.length); //gives the length of array --> 6
     //   System.out.println(marks[0]);//enter index value --> 69
     //   System.out.println(marks[3]);  //58

        //For printing array use forloop (ICU)

        for(int i=0; i<marks.length; i++) { //index starts from 0 to length-1
            System.out.println(marks[i]);//69, 87, 74, 58, 89, 90
        }

        //if u want to sort these arrays and again print
        Arrays.sort(marks); //function part of collection framework
        System.out.println("--------------");
        for(int i=0; i<marks.length; i++) { //index starts from 0 to length-1
            System.out.println(marks[i]);//58,69,74,87,89,90
        }

    }
}
