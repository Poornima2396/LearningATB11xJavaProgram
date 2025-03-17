package ex_08_if_Condition;

public class Lab070_if_Condition_02 {
    public static void main(String[] args) {
        //taking input from user by using Integer.ParseInt(args[0])
        int age = Integer.parseInt(args[0]);//after run edit config
        if (age>18) {
            System.out.println("Yes you can go to GOA"); //input given 30
        } else {
            System.out.println(" No you can't go to GOA");
        }


    }
}
