package ex_03_Java_Literals;

public class Lab024_Char_Literal {
    public static void main(String[] args) {
        char c1 ='A'; //this is a character
      //  char c2="B"; //this is not character, this is String
        char c2 ='B';
        char c3 = '@';
        char c4 = '_';
        char c5 = '9';
        char c6 = '1';
        char c7 = '(';
        char c8 = ' '; //blank space is also a character


        //types of characters
        //Escape character
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

       // System.out.println("PoornimaKamble");

        System.out.println("Poornima"+new_line+"Kamble"); //adds new line
        System.out.println("Poornima"+tab_line+"Kamble"); //adds tab space
        System.out.println("Poornima"+back_space+"Kamble"); //deletes one letter
        System.out.println("Poornima"+carriage_return+"Kamble"); //deletes previous word poornima here

        System.out.println("Hi This is first line\n This is second line \n This is Third Line");
                 //or u can use
        System.out.println("Hi This is first line"+new_line+" This is second line"+new_line+" This is Third Line");


    }
}
