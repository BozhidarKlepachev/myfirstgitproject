package homeWork1;

import java.util.Scanner;

public class homeWork1 {
    public static void main(String[] args) {
        printName();
    }

    public static void printName() {
        String firstName = "Bozhidar";
        String secondName = "Andreev";
        String lastName = "Klepachev";

        System.out.println("My name is: " + firstName + " " + secondName + " " + lastName);
    }

    public static void printTrianglePerimeter () {
        float a = 3.5F;
        float b = 4.5F;
        float c = 5.5F;

        float perimeter = a + b + c;
        System.out.println("Triangle Perimeter is: " + perimeter);
    }

    public static void printTriangleArea() {
        float b = 5.1F;
        float h = 4.4F;

        float triangleArea = (b * h) /2;
        System.out.println("The area of triangle is:" + triangleArea);
    }

    public static void printAsterisks () {
        char asterisk = '*';
        System.out.println("     " + asterisk);
        System.out.println("    " + asterisk + " " + asterisk);
        System.out.println("   " + asterisk + " " + asterisk + " " + asterisk);
    }

    public static void printTrianglePerimeterInput () {
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter side a size");
        float a = myObj.nextFloat();

        System.out.println("Enter side b size");
        float b = myObj.nextFloat();

        System.out.println("Enter side c size");
        float c = myObj.nextFloat();

        float perimeter = a + b + c;
        System.out.println("Triangle Perimeter is: " + perimeter);
    }

    public static void printTriangleAreaInput() {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter side a size");
        float a = myObj.nextFloat();

        System.out.println("Enter side h size");
        float h = myObj.nextFloat();

        float area = (a * h) / 2;
        System.out.println("The Area of the triangle is: " + area);
    }

    public static void convertMinutesToYearsDays() {
        byte minutesInHour = 60;
        byte hoursInDay = 24;
        short daysInYear = 365;
        int minutesInYrar = minutesInHour * hoursInDay * daysInYear;

        Scanner input = new Scanner(System.in);
        System.out.println("Input the number of minutes");

        long min = input.nextLong();
        long years = (min / minutesInYrar);
        long days = (min / minutesInHour / hoursInDay) % daysInYear;

        System.out.println(min + " minutes is approximately " + years + " years and " + days + " days ");
    }
 }