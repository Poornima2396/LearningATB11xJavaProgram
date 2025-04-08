package ex_018_OOPs_Constructor;

public class Lab0165_Defaultconstructor_Ex2 {
    public static void main(String[] args) {

        Car c1 = new Car();
     //    c1.name = "Tesla"; //output - Tesla   1991    XXX
        System.out.println(c1.name);  //null
        System.out.println(c1.year);  //0
        System.out.println(c1.model); //null

        System.out.println(" -------------- ");
//By using default constructor,every object will have the same default constructor
        Car c3 = new Car();
        System.out.println(c3.name);  //Unknown car
        System.out.println(c3.year);  //1991
        System.out.println(c3.model); //XXX

    }
}
class Car {
    String name ;
    int year;
    String model;

    Car(){
        name = "Unknown car";
        year = 1991;
        model = "XXX";
    }
}
