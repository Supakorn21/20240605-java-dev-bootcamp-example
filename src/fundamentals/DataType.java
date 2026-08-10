package fundamentals;

public class DataType {

    /*
        Numeric Types - จำนวนเต็ม
            byte (8-bit signed integer)
            short (16-bit signed integer)
            int (32-bit signed integer, most commonly used)
            long (64-bit signed integer)

         Numeric Types Floating-Point (เลขทศนิยม)
            float (32-bit single-precision floating-point number)
            double (64-bit double-precision floating-point number, more commonly used)

         Character Type:
            char (16-bit Unicode character)

         Boolean Type:
            boolean (represents true or false)
    * */
    public static void main(String[] args) {
        // variables use camelCase
        byte exampleOfByte = 127;
        int exampleOfInteger = 100;
        long exampleOfLong = 100;
        short exampleOfShort = 100;


        double exampleOfDouble = 25.00;
        float exampleOfFloat = 25.00f;

        char grade = 'D';
        boolean isEnabled = true;
        
        System.out.println(STR."Byte: \{exampleOfByte}");
        System.out.println(STR."Integer: \{exampleOfInteger}");
        System.out.println(STR."Long: \{exampleOfLong}");
        System.out.println(STR."Short: \{exampleOfShort}");
        System.out.println(STR."Double: \{exampleOfDouble}");
        System.out.println(STR."Float: \{exampleOfFloat}");
        System.out.println(STR."Char: \{grade}");
        System.out.println(STR."Boolean: \{isEnabled}");


    }
}
