package ex_013_Functions;

public class Lab0114_UserDefined2 {
    public static void main(String[] args) {



        //USer defined functions
        //1.Without parameters and without return type
        //2.Without parameters and with return type
        //3.With parameters and without return type
        //4.With parameters and with return type

        //1.Without parameters and without return type
        wp_wr_greet(); //Hii gets printed and void means no need to assign

        //2.Without parameters and with return type
        String msg = greet_with_hello_wp_with_RT();
        System.out.println(msg); //o/p--> Hi..How are you

        //3.With parameters and without return type (90% asked)
        greet_with_details("Pramod", 65, 10);

        greet_with_full_name("Poornima", "Kamble");

        //4.With parameters and with return type

        int sum=sum_of_three_num(3, 4, 8);
        System.out.println(sum);   //15

    }
    //1.Without parameters and without return type (Declare) / Define

       static void wp_wr_greet() {
           System.out.println("HIIIIIIII");
       }

    //2.Without parameters and with return type

       static String greet_with_hello_wp_with_RT() {
           System.out.println("Hi");
           return "Hi how are you"; //this will retur the value
       }

    //3.With parameters and without return type (Imp- 90%)

       static void greet_with_details(String name, int age, double salary){
           System.out.println("Name is->" +name + "\n Age is->" +age + "\nSalary is->" +salary);
       }
       static void greet_with_full_name(String firstname, String lastname) {
           System.out.println("Your name is" + firstname + lastname);
       }

    //4.With parameters and with return type

       static int sum_of_three_num(int a, int b, int c) {
        return a+b+c;
       }




}
