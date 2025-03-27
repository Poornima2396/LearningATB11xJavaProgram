package ex_015_Arrays;

import java.util.Arrays;

public class Lab0141_2nd_Highest_Number_Array_IQ3 {
    public static void main(String[] args) {
        //Find second largest number in array without any function
        int[] numbers = {12,34,10,1,100,3,4,32};
        //100,34

        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]); //for 2nd highest - 34
        System.out.println(numbers[numbers.length-3]); //for 3rd highest - 32

    }
}
