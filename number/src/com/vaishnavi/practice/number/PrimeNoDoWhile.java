package com.vaishnavi.practice.number;

import java.util.Scanner;

public class PrimeNoDoWhile {

    // Pseudo Code:
    // index = 1;
    //  do {
    //      index++;
    //     } while (no % index != 0);
    //
    //  print((index == no) ? "prime no" : "not a prime no");

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Pls enter positive no: ");
        int no = SCANNER.nextInt();
        int index = 1;
        do {
            index++;
        } while (no % index != 0);

        System.out.println((index == no) ? "prime no" : "not a prime no");
    }
}

