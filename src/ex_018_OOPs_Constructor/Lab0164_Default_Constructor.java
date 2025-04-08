package ex_018_OOPs_Constructor;

public class Lab0164_Default_Constructor {
    public static void main(String[] args) {

        //default constructor will give u some initialized value for all the attributes
        // which is common..
     Cars c2 = new Cars();
        System.out.println(c2.name);  //null
        System.out.println(c2.year);  //0
        System.out.println(c2.model); //null
    }
}
      class Cars {
    String name ;
    int year;
    String model;
      }