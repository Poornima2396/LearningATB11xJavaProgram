package ex_015_Arrays;

public class Lab0139_Reverse_Array {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6};
        //6,5,4,3,2,1
        //make the for loop reverse ulta
        for(int i = numbers.length-1; i>=0; i--){
            System.out.println(numbers[i]); //654321
        }

    }
}
