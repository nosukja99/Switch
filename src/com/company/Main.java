package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int inputDay=0;
        Scanner scanner= new Scanner(System.in);

        while(inputDay<1) {
            System.out.println("I will print the month names given the exact number of days." +
                    "What day do you want to input. Please input a integer.");
            inputDay = scanner.nextInt();
        }
        if(inputDay<29 || inputDay>31)
        {
            System.out.println("No months have exactly "+inputDay+" days.");
        }
        else {
            switch (inputDay) {
                case 29:
                    System.out.println("February");
                    break;
                case 30:
                    System.out.println("April, June, September, November");
                    break;
                case 31:
                    System.out.println("January, March, May, July, August, Octobe, November");
            }
        }
    }
}
