package ex_09_SwitchStatements;

public class Lab083_JDK13_Above {
    public static void main(String[] args) {
        //JDK > 13
        //you can use cases with comma separated with multiple cases
        int itemCode = 004;

        switch(itemCode){
            case 001,002,006:
                System.out.println("All of them are Electronic Gadget");
                break;
            case 003,004,005:
                System.out.println("This is Mech");
                break;
            default:
                System.out.println("None");

        }

    }
}
