package com.vaishnavi.practice.pattern;

public class Pattern2 {

    // Expected output:
    // * * * * *  -> line#0
    // * * * *    -> line#1
    // * * *      -> line#2
    // * *        -> line#3
    // *          -> line#4
    private static final int PATTERN_SIZE = 7;

    public static void main(String[] args) {

        System.out.println("WHILE loop demonstration");
        int lineNo = 0;
        while (lineNo < PATTERN_SIZE) {
            int index = PATTERN_SIZE - lineNo;
            while (index > 0) {
                System.out.print("*\t");
                index--;
            }

//            int index = 0;
//            while (index < PATTERN_SIZE - lineNo) {
//                System.out.print("*\t");
//                index++;
//            }

            System.out.println();
            lineNo++;
        }

        System.out.println("\n\nFOR loop demonstration");

        for (int line = 0; line < PATTERN_SIZE; line++) {
            for (int index = PATTERN_SIZE - line; index > 0; index--) {
                System.out.print("*\t");
            }

//            for (int index = 0; index < PATTERN_SIZE - lineNo; index++) {
//                System.out.print("*\t");
//            }

            System.out.println();
        }
    }
}

