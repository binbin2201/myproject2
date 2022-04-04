package com.bin.ticket;

import java.util.Scanner;

public class Ticket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your start station : Taipei = 1 ,Taichung = 2, Kaohsiung = 3");
        int choice = Integer.parseInt(scanner.next());
        String startStation = null;
        String endStation = null;
            switch (choice) {
                case 1:
                    startStation = "Taipei";
                    break;
                case 2:
                    startStation = "Taichung";
                    break;
                case 3:
                    startStation = "Kaohsiung";
                    break;
            }
            System.out.println("Please enter your terminal station : Taipei = 1 ,Taichung = 2, Kaohsiung = 3");
            choice = Integer.parseInt(scanner.next());

            switch (choice) {
                case 1:
                    endStation = "Taipei";
                    break;
                case 2:
                    endStation = "Taichung";
                    break;
                case 3:
                    endStation = "Kaohsiung";
                    break;
            }

            System.out.println(startStation + endStation);
        }
    }


