import java.util.Scanner;

public class ConsoleController {

    Scanner scanner = new Scanner(System.in);

    void out (String value) {
        System.out.print(value);
    }
    void outLn (String value) {
        System.out.print(value);
    }
    void outLn(int value) {
        System.out.println(value);
    }

    void out (int value) {
        System.out.print(value);
    }
    int readInt () {
        System.out.println("Enter the value");
        return scanner.nextInt();
    }

    void printArray(int[] array) {
        for (int x : array) {
            out("[" + x + "]");
        }
        outLn ("");
    }

    int[] getArrayFromConsole() {
        int[] array;
        outLn("Enter size:");
        int size = readInt();
        array = new int[size];
        return fillArray(array);
    }

    int[] fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = readInt();
        }
        return array;
    }
}
