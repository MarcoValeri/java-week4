import java.util.Scanner;
import java.util.Arrays;

public class Four {

    /*
    * Create a method that gets as
    * @parmeter an array of int and
    * @return the second-largest element in the array
    */
    public static int getSecondLargest(int[] array) {

        int largest_int = 0;
        int second_largetst_int = 0;

        // Find the largest int inside the arrry
        for (int i = 0; i < array.length; i++) {

            if (array[i] > largest_int) {
                largest_int = array[i];
            }

        }

        // Find the second largest int inside the array
        for (int i = 0; i < array.length; i++) {

            if (array[i] > second_largetst_int && array[i] < largest_int) {
                second_largetst_int = array[i];
            }

        }

        return second_largetst_int;

    }

    /*
    * Create a method that allows user select the length of an array
    * an then fill up it with int
    * @parameter no one
    * @return created array
    */
    public static void getNewArray() {

        // Get array length and crate an empty array
        System.out.println("Please, select the length of your array:");
        Scanner array_length = new Scanner(System.in);
        int[] array = new int[array_length.nextInt()];

        // Get array elements by user's inputs
        System.out.println("Please, select the integer that you want to add inside your array:");
        Scanner element = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Inser integer " + (i + 1) + ": ");
            array[i] = element.nextInt();
        }

        // Close both inputs
        array_length.close();
        element.close();

        System.out.println("Your array is:");
        outputArray(array);

        // Call method getSecondLargest()
        System.out.println("\nThe second largest element of your array is: " + getSecondLargest(array));

    }

    /*
    * Create a method that get as
    * @parameter an array of int and
    * @return its elements by a string
    */
    public static void outputArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }
 
    public static void main(String[] args) {

        getNewArray();

    }

}