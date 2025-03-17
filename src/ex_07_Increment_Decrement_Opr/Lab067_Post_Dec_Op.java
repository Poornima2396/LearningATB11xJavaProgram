package ex_07_Increment_Decrement_Opr;

public class Lab067_Post_Dec_Op {
    public static void main(String[] args) {
        //we will be decrementing the value by 1
        //a-- => assign the value first and then decrease by 1

        int a = 10;
        int result_post = a--;
        System.out.println(result_post); //10
        System.out.println(a);  //9
         //Line no | a | result
        // 8  | 10  | NA
        // 9  | NA  | 10
        // 10 | NA  | 10
        // 11 | 9   | 10

    }
}
