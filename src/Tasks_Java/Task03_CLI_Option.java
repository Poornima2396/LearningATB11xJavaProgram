package Tasks_Java;

public class Task03_CLI_Option {
    public static void main(String[] args) {
        // CLI Options
        //user inputs by taking arguments args
        // Take a user input - Name, Age and Salary and print them in the end.
        // Take a user input //2 numbers from the arguments and calculate the maximum
        // in between with ternary operator.
        System.out.println("Enter the name,age and salary");
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);

        System.out.println(name); //Edit config and run
        System.out.println(age);
        System.out.println(salary);

    }
}
