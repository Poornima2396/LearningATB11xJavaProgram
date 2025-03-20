package ex_09_SwitchStatements;

public class Lab084_Interview_Q6 {
    public static void main(String[] args) {
        int a=11;
        switch(-1) {
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10"); //Switch(-1) will match with case -1.
                break;
            case 9 :
                System.out.println("7");
                break;

        }
    }
}
