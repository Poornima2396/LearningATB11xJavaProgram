package ex_011_WhileLoop;

public class Lab0100_Whileloop {
    public static void main(String[] args) {
        //while --> Initialization, Condition, Updation
        int i = 0; //Initialization will be outside
        while(i<10) { // Condition must be true to enter the loop
            System.out.println(i);
            i++; //Updation

            //same outputs 0 to 9
        }
         //I,C,U --> for loop
        for (int j = 0; j<10; j++){
            System.out.println(j);
        }
    }
}
