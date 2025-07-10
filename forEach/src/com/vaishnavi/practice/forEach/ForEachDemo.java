package com.vaishnavi.practice.forEach;


public class ForEachDemo {
    public static void main(String[] args) {
        int[] array = new int[]{50,60,70,80,90};
//        int[] array = new int[5];
//        array[0] = 50;
//        array[1] = 60;
//        array[2] = 70;
//        array[3] = 80;
//        array[4] = 90;

        int index = 0;
        System.out.println("Print array using WHILE loop: ");
        while(index < array.length) {
            System.out.println(array[index]);
            index++;
        }

        System.out.println("Print array using FOR loop: ");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        System.out.println("Print array using FOR-EACH loop: ");
        for(int value : array) {
            System.out.println(value);
        }
    }
}

