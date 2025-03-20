package ex_010_For_Loop;

public class Lab094_ForLoop_IQ5 {
    public static void main(String[] args) {
        for(int i=0; i>0; i--){ //0 is not greater than 0
            System.out.println(i); //nothing gets printed
        }
        for(int i=0; i<-10; i--){ //0 is not less than -10
            System.out.println(i); //nothing gets printed
        }
        for(int i=-1; i<-10; i--){  //-1 is not less than -10
            System.out.println(i); //nothing gets printed
        }

    }
}
