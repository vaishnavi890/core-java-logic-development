package com.vaishnavi.practice.pattern;

public class Pattern1 {

    // Expected output:
    // *
    // * *
    // * * *
    // * * * *
    // * * * * *
    private static final int PATTERN_SIZE = 5;

    public static void main(String[] args) {

//        int lineNo = 0;
//        while(lineNo < PATTERN_SIZE) {
//
//            int index = 0;
//            while(index <= lineNo) {
//                System.out.print("*[line:"+ lineNo +",index:"+index+"]\t");
//                index++;
//            }
//            System.out.println();
//            lineNo++;
//        }

        System.out.println("WHILE loop demonstration:");
        // while loop demonstration
        int lineNo = -1;
        while(++lineNo < PATTERN_SIZE) {
            int index = -1;
            while(++index <= lineNo) {
                //System.out.print("*[line:"+ lineNo +",index:"+index+"]\t");
                System.out.print("*\t");
            }
            System.out.println();
        }

        // for loop demonstration
        System.out.println("\n\nFOR loop demonstration:");
        for(int line = 0; line < PATTERN_SIZE;line++) {
            for(int index = 0; index <= line;index++) {
                System.out.print("*\t");
            }
            System.out.println();
        }
    }
}


