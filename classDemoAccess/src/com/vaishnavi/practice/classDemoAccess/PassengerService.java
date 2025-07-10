package com.vaishnavi.practice.classDemoAccess;

import com.vaishnavi.practice.classDemo.Passenger;

import java.util.Scanner;

public class PassengerService {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter passenger data:");

        System.out.println("Please enter passenger name:");
        String name = SCANNER.nextLine();

        System.out.println("Please enter passenger address:");
        String address = SCANNER.nextLine();

        System.out.println("Please enter passenger age:");
        int age = SCANNER.nextInt();

        System.out.println("Please enter passenger gender:");
        String gender = SCANNER.next();

        System.out.println("Please enter passenger ticket price:");
        int ticketPrice = SCANNER.nextInt();

        System.out.println("Please enter passenger luggage size:");
        float luggageSize = SCANNER.nextFloat();

        Passenger passenger = new Passenger();
        passenger.name = name;
        passenger.setAddress(address);
        passenger.setAge(age);
        passenger.setGender(gender);
        passenger.setTicketPrice(ticketPrice);
        passenger.luggageSize = luggageSize;

        System.out.println("Passenger details are : " + passenger);
    }
}


