package ex_015_Arrays;

public class Lab0143_ForEachLoop_Arrays {
    public static void main(String[] args) {

        //**For Each Arrays --(Enhanced For Loop)
        //SYntax : for(datatype item : array) {
        //code to be executed for each item
        //   }

        //example:
        String[] names = {"Pramod", "amit", "Lucky"};
        for (String name : names) {
            System.out.println(name);//it will pick all names one by one
        }
    }
}
