package ex_015_Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab0149_2D_Multiplication_Table_IQ {
    public static void main(String[] args) {
        //i*j
        //  i,j        i,j     i*j
        //1,0,0 -> * = j<i     0*0=0
        //2,0,1 ->   = j>i     0*1=0
        //3,0,2 ->   = j>i     0*2=0

        //4,1,0 -> *  = j<i    1*0=0
        //5,1,1 -> *  = j<=i   1*1=1
        //6,1,2  ->   = j>i    1*2=2

        //7,2,0 -> *  = j<i    2*0=0
        //8,2,1 -> *  = j<i    2*1=1
        //9,2,2 -> *  = j<=i   2*2=4

        //Take input from user
          Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size");
        int Size_of_Table = scanner.nextInt();

        for (int i=0; i<Size_of_Table; i++){
            for(int j=0; j<Size_of_Table; j++){
//                System.out.print(i + "x" + j +"=" + (i*j) + "\t\t");
//                Enter the size
//                3
//                0x0=0		0x1=0		0x2=0
//                1x0=0		1x1=1		1x2=2
//                2x0=0		2x1=2		2x2=4

                System.out.print((i*j) + "\t\t");
//                Enter the size
//                3
//                0		0		0
//                0		1		2
//                0		2		4

            }
            System.out.println(" ");
        }

    }
}
