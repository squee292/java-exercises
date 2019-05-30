package org.launchcode.java.studios;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the radius of the circle:");
        Float radius = scanner.nextFloat();

        while (radius < 0) {
            System.out.println("You have entered a negative number!!!!");
            System.out.println("Enter the radius of the circle:");
            radius = scanner.nextFloat();
        }
            Double area = 3.14 * (radius * radius);
            System.out.println("The area of the circle is: " + area);


//        if (radius < 0) {
//            System.out.println("You have entered a negative number!!!!");
//
//        }else {
//                Double area = 3.14 * (radius * radius);
//                System.out.println("The area of the circle is: " + area);
//            }
        }

    }

