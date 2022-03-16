package com.infogalaxylinecomparisonproblem;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class LineComparisonProblem {
    public static void equals(double lengthofline1, double lengthofline2) {
        if (lengthofline1 == lengthofline2) {
            System.out.println("Both Line Are same");
        } else {
            System.out.println("Line Are NO same");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Line Comparison Program Made by Yash");
        //-UC-1-calculate Length
        Scanner sc = new Scanner(System.in);
        //-UC-1- Length Line 2
        double x1;
        double y1;
        double x2;
        double y2;
        //-UC-2-Length of Line 2
        double a1;
        double a2;
        double b1;
        double b2;
        System.out.println("Enter the value of x1 coordinate : ");
        x1 = sc.nextDouble();
        System.out.println("Enter the value of x2 coordinate : ");
        x2 = sc.nextDouble();
        System.out.println("Enter the value of y1 coordinate : ");
        y1 = sc.nextDouble();
        System.out.println("Enter the value of y2 coordinate :");
        y2 = sc.nextDouble();
        double lengthofline1;

        lengthofline1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        System.out.println("length=" + lengthofline1);

        System.out.println("Enter the A1: ");
        a1 = sc.nextDouble();
        System.out.println("Enter the A2 : ");
        a2 = sc.nextDouble();
        System.out.println("Enter the B1 : ");
        b1 = sc.nextDouble();
        System.out.println("Enter the B2 :");
        b2 = sc.nextDouble();
        double lengthofline2 = Math.sqrt(Math.pow((a2 - a1), 2) + Math.pow((b2 - b1), 2));
        System.out.println("length2 =" + lengthofline2);
        equals(lengthofline1, lengthofline1);
    }
}






