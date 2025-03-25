package ex_012_Do_While_Loop;

public class Lab0109_Diff_While_DoWhile {
    public static void main(String[] args) {
        //while is entry controlled loop
        //do while will execute once even if the statement is false

        int a = 0;
      //  while(a<0) {
      //      System.out.println(a); //nothing gets printed as 0<0
        //    a++;
        //}

        do {
            System.out.println(a); //a gets printed first --> 0 -
            // one time gets executed
            a++;   // then value gets incremented
        } while (a<0); //then condition gets checked

    }
}
