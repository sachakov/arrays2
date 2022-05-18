import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int[] inputArray;
        int[] resultArray;
        int resultArraySize = 0;
        int resultArrayCounter = 0;
        ConsoleController consoleController = new ConsoleController();

        inputArray = consoleController.getArrayFromConsole();
        consoleController.outLn("Input array is:");
        consoleController.printArray(inputArray);

            for (int i : inputArray) {
            if (i > 0) {
                resultArraySize++;
            }

        }
        resultArray = new int[resultArraySize];

        for (int i : inputArray) {
            if (i > 0) {
                resultArray[resultArrayCounter] = i;
                resultArrayCounter++;
            }
        }

        consoleController.outLn("Result array is:");
        consoleController.printArray(resultArray);

    }
}
