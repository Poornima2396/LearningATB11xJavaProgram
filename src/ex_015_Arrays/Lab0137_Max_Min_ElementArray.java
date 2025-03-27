package ex_015_Arrays;

public class Lab0137_Max_Min_ElementArray {
    public static void main(String[] args) {

        int[] array = {25, 14, 56, 15,36, 56, 77, 18,29,49};
        //can we take input from user also --> Yes - later we will learn
        //Max and Min

        //MAx
        int max_output = give_me_max(array);//give_me_max creates a static method
        // automatically hover on it
        int min_output = give_me_min(array);
        System.out.println(max_output); //77
        System.out.println(min_output); //14
    }

     static int give_me_max(int[] array) {
        int max = array[0]; //consider first 25 as max
        for(int i=0; i>array.length; i++){
            if (array[i]>max) {
                max = array[i];
            }
        }
        return max;
    }

    //Same logic for MIN
     static int give_me_min(int[] array) {
        int min = array[0]; //consider first 25 as max
        for(int i=0; i<array.length; i++){
            if (array[i]<min) {
                min = array[i];
            }
        }
        return min;
    }

}
