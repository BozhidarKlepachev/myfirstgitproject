package homeWork2;

import java.util.Scanner;

public class homeWork2 {


    public static void main(String[] args) {
        buildTriangle ();
    }

    public static void buildTriangle() {
        float angle1, angle2, angle3;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter value for first angle:");
        angle1 = scanner.nextFloat();
        System.out.println("Enter value for second angle:");
        angle2 = scanner.nextFloat();
        System.out.println("Enter value for third angle:");
        angle3 = scanner.nextFloat();

        String validMessage = "The triangle can be build! The type of the triangle is: ";

        float sumOfAngles = angle1 + angle2 + angle3;

        if (sumOfAngles != 180) {
            System.out.println("The triangle cannot be build!");
        } else if (angle1 == 60 && angle2 == 60 && angle3 == 60) {
            System.out.println(validMessage + "Equilateral");

        } else if (angle1 == 90 || angle2 == 90 || angle3 == 90) {
            System.out.println(validMessage + "Right-angled");

        } else if (angle1 > 90 || angle2 > 90 || angle3 > 90) {
            System.out.println(validMessage + "Obtuse");

        } else if (angle1 < 90 && angle2 < 90 && angle3 < 90) {
            System.out.println(validMessage + "Acute");

        } else if (angle1 == angle2 || angle1 == angle3 || angle2 == angle3) {
            System.out.println(validMessage + "Isosceles");

        } else {
            System.out.println(validMessage + "Multifaceted");

        }
    }

    public static void printWeekDay () {
        System.out.println("Please enter a day of the week: ");

        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("The " + day + "firest day of the week is Monday");
                break;
            case 2:
                System.out.println("The " + day + "second day of the week is Tuesday");
                break;
            case 3:
                System.out.println("The " + day + "third day of the week is Wednesday");
                break;
            case 4:
                System.out.println("The " + day + "fourth day of the week is Tuesday");
                break;
            case 5:
                System.out.println("The " + day + "fifth day of the week is Friday");
                break;
            case 6:
                System.out.println("The " + day + "sixth day of the week is Saturday");
                break;
            case 7:
                System.out.println("The " + day + "seventh day of the week is Sunday");
                break;
            default:
                System.out.println("Invalid day: " + day + "Please select a day between 1-7");
        }


    }

    public static void isPersonEligibleToWork () {

        String eligibleToWorkMessage = "You are eligible to work";
        String notEligibleToWorkMessage = "You are NOT eligible to work";

        System.out.println("Please enter your age:");

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();

        if (age >= 16) {
            if (age > 67) {
                System.out.println(notEligibleToWorkMessage);
            } else {
                System.out.println(eligibleToWorkMessage);
            }
        } else {
            System.out.println(notEligibleToWorkMessage);
        }
    }
    public static void calculateRevenue () {
        double revenue;
        double unitPrice;
        int quantity;
        double discountRate;
        double discount;
        String revenueMessage = "The revenue from sale:";
        String discountMassage = "Discount: ";
        char dollar = '$';

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter unit price:");
        unitPrice = scanner.nextDouble();

        System.out.println("Please enter quantity:");
        quantity = scanner.nextInt();

        revenue = unitPrice * quantity;

        if (quantity >= 100 && quantity <= 120) {
            discountRate = 0.15;
        } else if (quantity > 120) {
            discountRate = 0.20;
        } else {
            discountRate = 0;
        }

        discount = revenue * discountRate;
        revenue = revenue - discount;

        System.out.println(revenueMessage + revenue + dollar);
        System.out.println(discountRate + discount + dollar);
    }

    public static void printLargestNumber() {
        int[] arr = {2, 11, 45, 9};
        //int[] arr = {-3, -5, -2, -4};
        //int[] arr = {-23, -1, -4, -5, 0};

        int largestNumber = arr[0];
        int i;

        // Traverse array elements from second and
        // compare every element with current max
        for (i = 1; i < arr.length; i++) {
            if (arr[i] > largestNumber) largestNumber = arr[i];
        }

        System.out.println("The largest number is: " + largestNumber);
    }

    public static void planVacation() {
        String vacationType;
        double budget;
        double dailyBudget;
        int people;
        int days;
        String bulgariaDestinationMessage = "Available destination: Bulgaria";
        String nonBulgariaDestinationMessage = "Available destination: Outside Bulgaria";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter vacation type:");
        vacationType = scanner.nextLine();

        System.out.println("Please enter number of days:");
        days = scanner.nextInt();

        System.out.println("Please enter number of people:");
        people = scanner.nextInt();

        System.out.println("Please enter your budget:");
        budget = scanner.nextDouble();

        dailyBudget = budget / (days * people);

        switch (vacationType) {
            case "Beach":
                if (dailyBudget < 50) {
                    System.out.println(bulgariaDestinationMessage);
                } else {
                    System.out.println(nonBulgariaDestinationMessage);
                }
                break;
            case "Mountain":
                if (dailyBudget < 30) {
                    System.out.println(bulgariaDestinationMessage);
                } else {
                    System.out.println(nonBulgariaDestinationMessage);
                }
                break;
            default:
                System.out.println("There is no information about this type of vacation!");
        }
    }

    public static void printDivisibleNumbers() {
        int[] list = {12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
        int num;

        for (int i = 0; i < list.length; i++) {
            num = list[i];
            if ((num % 5) == 0) {
                System.out.println(num);
                if (num > 150) {
                    break;
                }
            }
        }
    }

    public static void reverseList() {
        int[] list = {2, 11, 45, 9};

        for (int i = list.length - 1; i >= 0; i--) {
            System.out.print(list[i] + " ");
        }
    }
}
