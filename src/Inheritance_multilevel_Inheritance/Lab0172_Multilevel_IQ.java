package Inheritance_multilevel_Inheritance;

public class Lab0172_Multilevel_IQ {
    public static void main(String[] args) {
        // Son s1 = new GrandFather(); Is son present when GF is born? - No
        //Son s1 = new Father();  Is son present when Father is born? - No
        Son amit = new Son(); //Is son present when son is born? - yes

        GrandFather g1 = new Son(); // Dynamic Dispatch
        //it will call whichver object u define above - Son
        g1.gf();
        g1.home();


        GrandFather g2 = new Father(); //father will be called
        g2.home();

        Father f2 = new Son(); //son will be called
        f2.F();
        // Father f3 = new GrandFather();

        // WebDriver driver = new ChromeDriver();

        //Grandfather - 1BHK
        //Sweet Little Home
        //Sweet Little Home
       // Father -2BHK



    }
}
