package com.company;

import java.util.Scanner;

public class RainfallCalc {

    public static void main(String[] args) {

        // User input width, height, rainfall
        double width, height, rainfall;

        // Receives inputs
        Scanner input = new Scanner(System.in);
        System.out.println("Pleas enter the width of the roof: ");
        width = input.nextDouble();
        System.out.println("Pleas enter the height of the roof: ");
        height = input.nextDouble();
        System.out.println("Enter the rainfall in inches: ");
        rainfall = input.nextDouble();
        width *= 12;
        height *= 12;
        double totalRainfall = (width * height * rainfall) / 231;
        System.out.printf("Total rainfall is: %.2f%n", totalRainfall);
    }
}
