import java.util.Scanner;
import java.util.Arrays;

public class Five {

    /*
    * Create a method that check if the elements of an int array 
    * are sorted in increasing order
    * @parameter array of int
    * @return boolean: true if the elements are sorted in increasing order
    */
    public static Boolean isSorted(int[] array) {

        Boolean output = false;

        for (int i = 1; i < array.length; i++) {

            if (array[i - 1] < array[i]) {
                output = true;
            } else {
                System.out.println("The elements in the array are not in increasing order");
                return output = false;
            }

        }

        if (output) {
            System.out.println("The elements in the array are in increasing order");
            return output;
        } else {
            return output;
        }

    }

    /*
    * Create a method that allows user to create an array by the inputs
    * @parameter no one
    * @return array
    */
    public static int[] getArray() {

        // Get array length by the user
        System.out.println("Please, select the length of your array befor fill up it:");
        Scanner input_length = new Scanner(System.in);
        int array_length = input_length.nextInt();

        // Declare array and get its elements by user's inputs
        int[] array = new int[array_length];

        Scanner input_element = new Scanner(System.in);
        
        
        System.out.println("Please, insert the integers of your array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Integer " + (i + 1) + ": ");
            int element = input_element.nextInt();
            array[i] = element;
        }

        // Close the inputs
        input_length.close();
        input_element.close();

        return array;

    }

    /*
    * Create a method that gets an
    * @parameter array of integer and 
    * @return a string with the element of that array
    */
    public static void outputArray(int[] array) {
        System.out.println("Your array is:");
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {
        
        // Create an array of ints
        int [] numbers = getArray();
        outputArray(numbers);
        isSorted(numbers);

    }

}