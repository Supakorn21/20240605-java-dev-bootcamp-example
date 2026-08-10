package fundamentals;

public class Operator {

    /*
        Type of operator in Java
        - Arithmetic
        - Relational
        - Logical
        - Bitwise
        - Assignment operators
        - Unary operators
        - Ternary
    */
    public static void main(String[] args) {

//        Execute method
        arithmetic();
        relational();
        logical();
        bitwise();
        assignmentOperators();
        unaryOperators();
        ternary();

    }

    public static void arithmetic(){
        var add = 10 + 10;
        var minus = 10 - 10;
        var multiply = 10 * 10;
        var divide = 10 / 10;
        var modulo = 89 % 10;  //9

    }

    public static void relational(){
        //relational or comparison
        var isEqual = 10 == 10;
        var isNotEqual = 10 != 10;
        var isGreater = 25 > 10;
        var isGreaterThanEqual = 25 >= 25;
        var isLessThan = 25 < 10;
        var isLessThanEqual = 25 <= 25;
    }

    public static void logical(){
        // AND, OR, NOT
        // AND - both of them true = true
        var score = 85;
        var isScoreGreaterThanEqualZero = score >= 0;
        var isScoreLessThanHundred = score <= 100;
        var isInGradeScore = isScoreGreaterThanEqualZero && isScoreLessThanHundred;

        // OR - Either if them true = true
        var day = 23; //5-10 / 20-25
        var isGoToMall = (day >= 5 && day <= 10) || (day >= 20 && day <= 25);

        //Java Short circuit
        //And - Left is False => False
        //OR - Left is True = > True

        //นิเสธ
        var isEnabled  = !true;


    }

    public static void bitwise(){
        //Example  - assume unsigned 4 bits = 0 - 15
        var exampleValue1 = 7; //111
        var exampleValue2 = 3; //011

        // & bitwise AND
        System.out.println(STR."AND : \{exampleValue1 & exampleValue2}"); // 3

        // | bitwise OR
        System.out.println(STR."OR : \{exampleValue1 | exampleValue2}"); // 7

        // ^ bitwise XOR
        System.out.println(STR."XOR : \{exampleValue1 ^ exampleValue2}"); // 7

        // ~ bitwise complement
        // 0 -positive, 1 - negative
        // 7 => 0_111, -7 => 1_001  (1_000 + 1)  (2's complement)
        // 1 => 0_001, -1 => 1_111 (0_001 => 1_110 + 1)


        // ~ => 1's complement
        // 7 => 0_111 => 1_000 => -8
        System.out.println(STR."Complement: \{~exampleValue1}");

        // -7 => 1_001 => 0_110 => 6
        System.out.println(STR."Complement -7: \{~(-7)}");


        // << left shift
        // 0111 << 2 =>011100
        System.out.println(STR."Left Shift: \{7 << 2}");


        // >> right shift (signed)
        // -8 >> 2 => 1_000 >> 2 => 1_1100 = -2
        System.out.println(STR."-8 Right Shift (signed) 2: \{-8 >> 2}");

        // >>> right shift (unsigned)
        // Positive: 8 >>> 2 => 0010 = 2
        System.out.println(STR."8 Right Shift (unsigned) 2: \{8 >>> 2}");
        // Negative: -8 >>> 2 (32 bits) = 1_000 => 11 1111111111 1111111111 1111111000
        // 00 11 1111111111 1111111111 11111110 =>1073741822
        System.out.println(STR."-8 Right Shift (unsigned) 2: \{-8 >>> 2}");

    }


    public static void assignmentOperators(){
        //assign value to variable
        var day = 25;

        //Combination arithmetic + assignment
        var amount = 20;
        amount += 10;
        System.out.println(STR."Current Amount = \{amount} ");
    }

    public static void unaryOperators(){
        //Incremental =>เพิ่ม 1  , ++
        //Decremental => ลด 1  , --

        var day = 10;

        day++;//day = 11
        System.out.println(STR."Incremental: \{day} ");

        day--; // day = 10
        System.out.println(STR."Decremental: \{day} ");

        var score = 100;


        System.out.println(STR."Score Incremental+: \{score++} ");

        System.out.println(STR."Score Incremental: \{score} ");
    }

    public static void ternary(){
        //if else
        var score = 85;

        //Consider PASS / NOT PASS
        var grade = (score >= 80) ? "PASS" : "NOT_PASS";

        System.out.println(STR."Grade: \{grade}");
    }




}
