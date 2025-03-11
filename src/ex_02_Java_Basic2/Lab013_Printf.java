package ex_02_Java_Basic2;

public class Lab013_Printf {
    public static void main(String[] args) {

        int a =10;
        System.out.printf("your variable is %d", a); //short --> souf
        //printf replaces the value
        //printf is used for formatting
         //%d -> int, byte, long, short - data type
         //%s -> String
         //%f -> Float, double
         //%b -> Boolean
        int b = 20;
        System.out.println("-----");
        System.out.printf("%d + %d", a,b);


    }
}
