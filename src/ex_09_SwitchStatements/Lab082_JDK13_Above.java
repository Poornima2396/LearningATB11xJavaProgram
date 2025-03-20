package ex_09_SwitchStatements;

public class Lab082_JDK13_Above {
    public static void main(String[] args) {
        //if java below 13 u r using, this code will not work
        //in JDK > 13
        int itemCode = 003;   //you can write using arrow also without break statement
        switch (itemCode) {
            case 001 -> System.out.println("001");
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("default");
        }

    }
}
