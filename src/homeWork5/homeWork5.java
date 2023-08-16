package homeWork5;

import java.util.Scanner;

public class homeWork5 {

    public static void main(String[] args) {
        double a = 3;
        double b = 2;
        double c = 4;

//        System.out.println(computeAverageSum(a,b,c));
    }

    public static double findSmallestNumber (double num1,double num2,double num3) {
        double smallestNumber = num1;

        if (smallestNumber > num2) {
            smallestNumber = num2;
        }
        if (smallestNumber > num3) {
            smallestNumber = num3;
        }
        return smallestNumber;
    }

    public static double computeAverageSum(double num1,double num2,double num3) {
        double sum = num1 + num2 + num3;
        double average = sum / 3;
        return average;

    }

    public static void displayMiddleChar(String text) {
        int textLength = text.length();

        if (text.length() != 0 && text.length() % 2 == 0) {
           int startPosition = textLength / 2 - 1;
            System.out.println(text.charAt(startPosition));
            System.out.println(text.charAt(startPosition+1));
        }
    }

    public static int countWords (String text) {
        text = text.trim();
        int count = 0;
        int textLength = text.length();

        if(textLength > 1) {
            count++;
            for (int i = 1;i < textLength; i++) {
                if (text.charAt(i) == ' ') {
                    count++;
                }
            }
        }
        return count;
    }

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPalindrome() {
        int remainder;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");

        int num = scanner.nextInt();

        if (num >=0) {
            int palindrome = num;

            while (palindrome > 0) {
                remainder = palindrome % 10;
                sum = (sum * 10) + remainder;
                palindrome = palindrome / 10;
            }
            return num == sum;
        }else {
            System.out.println("The integer must be non-negative!");
            return false;
        }
    }
}
