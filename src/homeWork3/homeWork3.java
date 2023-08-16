package homeWork3;

import java.util.LinkedList;
import java.util.Scanner;

public class homeWork3 {

    public static void main(String[] args) {
        printArraySum ();
    }
    public static void printArraySum () {
        double[] numbers = {0, 1, 2, 3, 4, 6};
        double sum = 0;
        for(double num : numbers) {
            sum += num;
        }
        System.out.println("The sum of the array is: " + sum);
    }

    public static void printMultidimensionalArray() {
        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12}
        };
        System.out.println(arr.length);
        System.out.println(arr[0].length);

        for(int a = 0; a < 4; a++) {
            for (int b = 0; b < 3; b++) {
                System.out.println(arr[a][b]);
            }
        }
    }

    public static void printDynamicMultidimensionalElements(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows: ");
        int rows = input.nextInt();

        System.out.println("Please enter number of colums: ");
        int cols = input.nextInt();

        int[][] Matrix = new int[rows][cols];

        for (int row = 0; row < rows; row++){
            for (int col = 0; col < cols; col++){
                System.out.println();
            }
        }
    }

    public static void printBiggestElement(){
        int[] numbers = {20, 60, 30, 40, 50};

        int biggestElement = numbers[0];
        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > biggestElement)
                biggestElement = numbers[i];
        System.out.println("The biggest Element is: " + biggestElement);
    }

    public static void reversLikendList(){
        LinkedList<String> tv = new LinkedList<>();
        tv.add("Sony");
        tv.add("Philips");
        tv.add("Samsung");
        tv.add("Jvc");
        System.out.println(tv);

        for (int i = 0; i <tv.size() / 2; i++) {
            String temp = tv.get(i);
            tv.set(i, tv.get(tv.size() - i - 1));
            tv.set(tv.size() - i - 1, temp);
        }
        System.out.println(tv);
    }

    public static void sumDiagonalMatrix() {
        int[][] matrix = {
                {10, 5, 6, 20},
                {1, 10, 20, 4},
                {11, 20, 10, 14},
                {20, 24, 25, 10}
        };
        int matrixSize = 4;

        int principalDiagonal = 0, secondaryDiagonal = 0;
        for (int row = 0; row < matrixSize; row++) {
            for (int col = 0; col < matrixSize; col++) {
                if (row == col)
                    principalDiagonal += matrix[row][col];
                if ((row + col) == (matrixSize - 1))
                    secondaryDiagonal += matrix[row][col];
            }
        }
        System.out.println(" The sum of principal diagonal is: " + principalDiagonal);
        System.out.println(" The sum of secondary diagonal is: " + secondaryDiagonal);
    }

    public static void isPalindrome() {
        String word = "racecar";

        String reveredWord = "";

        boolean isPalindrome = false;

        for (int i = word.length() - 1; i >= 0; i--) {
            reveredWord = reveredWord + word.charAt(i);
        }

        // Checking if both the strings are equal
        if (word.equals(reveredWord)) {
            isPalindrome = true;
        }

        System.out.println("The String is palindrome: " + isPalindrome);
    }

}

