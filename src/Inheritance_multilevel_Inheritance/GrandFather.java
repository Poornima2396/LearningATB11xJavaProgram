package Inheritance_multilevel_Inheritance;


public class GrandFather {
    void gf (){
        System.out.println("Grandfather - 1BHK");

    }

    //Dynamic Dispatch:
    //You can create a Son class object with the Father or Grandfather reference.
    //Only same name functions or behaviour are allowed to call by using gf,f ref.

        int gold_gf = 10;

    void home () {
        System.out.println("Sweet Little Home");
    }
}
