package ex_014_Strings_concept;

public class Lab0125_String_Function{

    public static void main(String[] args) {
        String name = "Payal";
        System.out.println(name.length()); //5
        System.out.println(name.charAt(3)); //always starts from index value 0
        // a
       //System.out.println(name.charAt(10)); //StringIndexOutOfBoundsException

        //2.Concat
        System.out.println(name.concat("Patel")); //PayalPatel

        //3.Contains() - it will search
        System.out.println(name.contains("om")); //false

        //4.equals()
        System.out.println(name.equals("Payal")); //true

        //5.equalsIgnoreCase
        System.out.println(name.equalsIgnoreCase("payal")); //true

        //6.indexOf()
        System.out.println(name.indexOf('a'));  //1
     // returns the index within the string
     //first occurence of the specified substring

        String s1 = "madam";
        System.out.println(s1.indexOf('m'));//it will always give 1st string value 0

        //7.length()
        System.out.println(name.length()); //5

        //replace( , )
        //older char will replace with new char
        System.out.println(name.replace('y', 'Y')); //paYal

        //split()
        String name4 = "poornima@live.com@123";
        //[] square bracket means array
        String[] split = name4.split("@");
        System.out.println(split[0]); //poornima
        System.out.println(split[1]); //live.com
        System.out.println(split[2]); //123

        //10.substring( , )
        System.out.println(name.substring(1, 3));//ay

        //11.toLowerCase()
        System.out.println("PAYAL".toLowerCase()); //payal

        //12.toUpperCase()
        System.out.println("payal".toUpperCase()); // PAYAL

        //13.startsWith()
        System.out.println(name.startsWith("P")); //true

        //14.endsWith()
        System.out.println(name.endsWith("m")); //false

        //15.trim() -- cuts the spaces
        String name3 = "       Payal Harish       ";
        System.out.println(name3.trim());  //Payal Harish

        //16.compareTo()
        System.out.println(name.compareTo("Payal")); //0 - gives integer 0/1
        //it will compare with the input name if false - 0 and if true - 1

        //17.indexOf()
        String n = "PoornimaK";
        System.out.println(n.indexOf("o")); //1
        System.out.println(n.lastIndexOf("o")); //2
        System.out.println(n.indexOf("g")); //-1 - nothing
        System.out.println(n.lastIndexOf("j"));//-1 - nothing













    }

}
