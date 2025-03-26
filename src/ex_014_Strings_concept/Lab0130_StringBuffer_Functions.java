package ex_014_Strings_concept;

public class Lab0130_StringBuffer_Functions {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");
        sb.append("Programming");
        System.out.println(sb); //JavaProgramming
        sb.delete(5,16); //delete the substring
        System.out.println(sb); //JavaP
        sb.replace(0,4,"C++");
        System.out.println(sb); //C++

        //Stringbuffer and Stringbuilder are rarely used in automation


    }
}
