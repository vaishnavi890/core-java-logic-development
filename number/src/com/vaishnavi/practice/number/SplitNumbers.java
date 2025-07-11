package com.vaishnavi.practice.number;

import java.util.Scanner;

public class SplitNumbers {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Pls enter positive number: ");
        int no = SCANNER.nextInt();

        // expected output: e.g. 3456 -> print every digit per line
        int[] digits = new int[String.valueOf(no).length()];
        int index = -1;
        while (no > 0) {
            digits[++index] = no % 10;
            no = no / 10;
        }

        index = digits.length;
        System.out.println("Split Digits: ");
        while (--index >= 0) {
            System.out.println(digits[index]);
        }
    }
}


