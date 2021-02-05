import java.util.Scanner;
import java.util.Arrays;

public class One {

    public static void swapEnds(int[] array) {

        int first_element = array[0];
        int last_element = array[(array.length - 1)];

        array[0] = last_element;
        array[(array.length - 1)] = first_element;

        outputArray(array);

    }

    /* Create a method
    * @parameter gets an array of integers as parameter
    * @return its elemtns as string
    */
    public static void outputArray(int[] array) {
        System.out.print(Arrays.toString(array));
    }

    public static void main(String[] args) {

        int[] array = new int[7];

        // Gets the elements of an array by user input
        System.out.println("Please, insert 7 integers:");
        Scanner element = new Scanner(System.in);

        for (int x = 0; x < array.length; x++) {
            System.out.print((x + 1) + " - ");
            array[x] = element.nextInt();
        }

        element.close();

        // Print out array
        System.out.println("These are your number:");
        outputArray(array);

        // Swap first element with the last one
        System.out.println("\nSwapped first element with the last one:");
        swapEnds(array);

    }

}