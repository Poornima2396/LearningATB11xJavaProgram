package ex_09_SwitchStatements;

public class Lab077_Interview_Q2 {
    public static void main(String[] args) {
        char ch = 'A';  //A value is 65 so its valid
        switch (ch) {
            case 65:
                System.out.println("Maths ASCII"); //output
                break;
            default:
                System.out.println("No Match");
        }
    }
}
