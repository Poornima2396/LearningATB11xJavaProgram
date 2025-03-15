package ex_06_Ternary_Operators;

public class Lab058_Real_Age_Classification {
    public static void main(String[] args) {
        //Lecture 13th MArch
 //age = 23->Adult(age>18), Minor age ->(age<18), Senior ->(age>65)
        //take input from user

        String age1 = args[0];//error - ArrayIndexOutOfBoundException
        //Square bracket means multiple arrays and can be multiple
        // above click on LAb058_Real_Age_Classification dropdown and goto
        // edit Configurations - there u can give the Program arguments/user inputs
        // from the string i.e, 65 / 45 for string and Run
        System.out.println(age1); //output u will get 65 for String
        System.out.println(age1 instanceof String); // output -> True
        //But we want to convert it into Integer
        int age = Integer.parseInt(age1);//called as type conversion or
        // wrapper class conversion , we will learn later

        String result = (age < 18)? "Minor" : (age<65) ? "Adult" : "Senior";
        System.out.println(result);


    }
}
