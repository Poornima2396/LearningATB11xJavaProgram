package ex_014_Strings_concept;

public class Lab0127_StringBuffer {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Poornima");
        stringBuffer.append("kamble");
        System.out.println(stringBuffer); //Poornimakamble
        //Poornimakamble gets printed and old String Poornima gets deleted
        //so only 1 string is present
        //it is mutable in nature

        //there is inbuilt function reverse, which can reverse the string

        System.out.println(stringBuffer.reverse()); //elbmakaminrooP


    }
}
