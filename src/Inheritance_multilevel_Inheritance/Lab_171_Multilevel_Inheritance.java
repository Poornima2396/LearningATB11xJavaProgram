package Inheritance_multilevel_Inheritance;

public class Lab_171_Multilevel_Inheritance {
    public static void main(String[] args) {

//        Son s1  = new Son();
//        s1.gf(); // s1 can access GF
//        s1.F(); // s1 can access F
//        s1.S(); // s1 can access S

        GrandFather gf = new GrandFather();
        gf.gf();
        System.out.println("---------");
        Father F = new Father();
        F.gf();
        F.F();
        System.out.println("---------");
        Son S = new Son();
        S.gf();
        S.F();
        S.S();
    //Grandfather - 1BHK
        //---------
        //Grandfather - 1BHK
        //Father -2BHK
        //---------
        //Grandfather - 1BHK
        //Father -2BHK
        //Son - 3BHK

    }
}
