package ex_09_SwitchStatements;

public class Lab081_Interview_Q5 {
    public static void main(String[] args) {
        //can we have duplicate cases in switch ..? ---> NO
        int a = 98;
        switch (a) {
            case 98:
                System.out.println("98");
          //  case 98:       //Duplicate cases are not allowed
          //      System.out.println("98");

        }

    }
}
