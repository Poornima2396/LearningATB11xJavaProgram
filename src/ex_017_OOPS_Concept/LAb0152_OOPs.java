package ex_017_OOPS_Concept;

public class LAb0152_OOPs {
    public static void main(String[] args) {
        Person amit;
        Person p2 = new Person(); //Person - class, p2- ObjectReferenceName
                                  // & new Person() - Object
        p2.name = "Lucky";
        System.out.println(p2.name);

        Person p3 = new Person();
        p3.name = "Pramod";
        System.out.println(p3.name);
    }

}
//This program will not take any memory spaces and this is explained in Functions ex013

//This is a blueprint we have created.. now we will write
// public static void main class and run the program

    class Person{

    //Attribute | Properties | DAta members | Instance variables


        String name;
        String phone;
        String color_eyes;
        int legs;
        double salary;
        byte age;
        double weight;
        boolean isMale;

        //Behaviour | Function | Method

        void sleep() {       // Void will not return anything
            System.out.println("I am sleeping");
        }

        String greet (String name) {
            return "Hello" +name;
        }

        void talk(){
            System.out.println("Talking");
        }

        int remaining_amount_salary (int salary,int tax) {
            return salary;
        }

    }
