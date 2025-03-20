package ex_010_For_Loop;

public class Lab099_ForLoop_Continue_Even_Number {
    public static void main(String[] args) {
        for(int i = 0; i<=50; i++) { //0 to 50 and run 51 times
            if(i%2==0){  //even
                System.out.println("even-> " +i);
                continue;
                //o/p---> even-> 0
                //odd-> 1
                //even-> 2
                //odd-> 3..........even->50
            }
            System.out.println("odd-> " +i);

        }
    }
}
