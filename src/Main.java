public class Main {
    public static void main(String[] args) {
        
        System.out.println("Hello world!");
        
        Case.main(new String[0]);
        SecondClass.main(new String[0]);
        SecondClass.main(new String[0]);

        System.out.println(3+4);
        System.out.println(3*4);

        String firstname = "Peter";
        String lastName = "Pan";
        firstname = "John";

        int numOne = 3;
        int numTwo = 4;
        int result = numOne + numTwo;
        System.out.println(result);

        int a = 30;
        int b;
        b = 40;
        b = 50;

        int c, d, e;
        c = 50;
        d = 60;
        e = 70;

        int A = 90;

        System.out.println(a);
        System.out.println(b);

        System.out.println("Hello world!!!!!!!: " + firstname + " " + lastName + "!");
        
        // Single line comment

        // data types
        // int, double, float, char, boolean, String

        // primitive data types
        // int, double, float, char, boolean

        // non-primitive data types
        // String, Array, Class, Interface

        // Memory allocation

        // byte, short, int, long

        // byte - 8 bit or 1 byte -128 to 127
        byte byteVar = 127;
        System.out.println(byteVar);

        // short - 16 bit or 2 byte -32768 to 32767
        short shortVar = 32767;
        System.out.println(shortVar);

        // int - 32 bit or 4 byte -2,147,483,648 to 2,147,483,647
        int intVar = 2147483647;
        System.out.println(intVar);

        // long - 64 bit or 8 byte -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
        // add L at the end of the number to specify it as long

        long longVar = 9223372036854775807L;
        System.out.println(longVar);

        int numOneLiteral = 32;
        int numTwoLiteral = 64;
        int resultExpression = numOneLiteral + numTwoLiteral;
        System.out.println(resultExpression);

        /*
        Multi-line comment
         */


    }
}
