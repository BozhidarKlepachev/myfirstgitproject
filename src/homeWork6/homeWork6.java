package homeWork6;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class homeWork6 {

    private static FileWriter getFileWriter(String filePath) throws IOException {
        FileWriter fileWriter = new FileWriter(filePath, true);
        return fileWriter;
    }
    protected static void closeFileWriter (FileWriter fileWriter) throws IOException {
        fileWriter.close();
    }

    public static void printToFile(FileWriter fileWriter,String text, int repeat) throws IOException {
        for (int i = 0; i < repeat; i++); {
            fileWriter.write(text + "\n");
        }
    }

    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = null;
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter the file path");
            String filePath = scanner.nextLine();
            System.out.println("Enter how many times to add the text in the file:");
            int howManyTimesToPrintTheTextFile = Integer.parseInt(scanner.nextLine());
            System.out.println("Provide the text");
            String textToAdd = scanner.nextLine();
            fileWriter = getFileWriter(filePath);
            printToFile(fileWriter,textToAdd,howManyTimesToPrintTheTextFile);
        } catch (IOException e) {
            System.out.println("Unable to print the text to the file! Provide valid file path and try again!");
        } catch (NumberFormatException e) {
            System.out.println("Provide valid number for how many times to add the text!");
        } finally {
            if (fileWriter != null) {
                closeFileWriter(fileWriter);
            }
        }
    }

}
