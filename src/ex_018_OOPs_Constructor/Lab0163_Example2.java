package ex_018_OOPs_Constructor;

public class Lab0163_Example2 {
    public static void main(String[] args) {
        WebAutomation w1 = new WebAutomation();
    }
}

   class WebAutomation {

    //Default constructor
       WebAutomation() {
           System.out.println("I want to read CSV file");
           System.out.println("Open the page before loading scripts");
       }
   }
