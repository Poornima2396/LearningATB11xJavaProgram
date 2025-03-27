package ex_015_Arrays;

public class Lab0140_SumOfArrays_InterviewQ {
    public static void main(String[] args) {
        int[] numbers = {12,34,44};
        int sum=0;

        System.out.println("-------");
        for(int i=0; i< numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum); //90
    }
}
