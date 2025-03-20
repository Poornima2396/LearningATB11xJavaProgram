package ex_010_For_Loop;

public class Lab098_ForLoop_Continue {
    public static void main(String[] args) {
        //Continue -> Skip
        for(int i=0; i<50; i++) { //0 to 49 and runs 50 times
            if(i==5){
                continue; //skip below code and continue with for loop
            }  //it will skip print for condition i==5 and continues from 5 to print
            System.out.println(i);

        }

    }
}
