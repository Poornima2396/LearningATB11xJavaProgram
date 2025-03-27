package ex_015_Arrays;

public class Lab0135_Arrays_Part2 {
    public static void main(String[] args) {
        String[] names = {"Poornima", "Mona", "Jiya"};
        System.out.println(names.length); //3
        System.out.println(names[0]); //Poornima
        System.out.println(names[2]); //Jiya
        System.out.println(names[1]); //Mona

        String[] name_atb11x = new String[3];
        name_atb11x[0] = "Ravi";
        name_atb11x[2] = "Jiya";
        name_atb11x[1] = "om";

        System.out.println(name_atb11x.length); //3
        System.out.println(name_atb11x[1]); //om
        System.out.println(name_atb11x[0]); //Ravi
        System.out.println(name_atb11x[2]); //Jiya

        boolean[] male_data = new boolean[2];
        male_data[0] = true;
        male_data[1] = false;
        System.out.println(male_data[0]);
        System.out.println(male_data[1]);





    }
}
