import java.util.Arrays;
import java.util.Scanner;

public class ArrayExercises {

    public static void main(String[] args) {

        // declare an array of integers
        // and allocate meory for 5 elements
        int[] array = new int[5];

        Scanner scanner = new Scanner(System.in);

        // note that array.length is used in the condition
        // this will work for an array of any length, not just 5
        for (int i = 0; i < array.length; i++) {

            // indexes range fro 0 to array.length - 1
            System.out.print("Enter integer number " + (i + 1) + ": ");
            // read an integer and store in it the array at index i
            array[i] = scanner.nextInt();
        }

        scanner.close();

        // call the printArray method and pass the array to it
        // as a parameter
        printArray("You input the following:", array);

        // call the sum method and pass the array to it
        // as a paramter
        // this method returns the sum of the element inside the array
        System.out.println("The sum of the integers inside the array is: " + sum(array));

        // call the repeatElemnts 
        // as a parameter array
        // this method returns three times the elements of an array
        repeatElements(array);
    }

    /*
    * A helper method that takes 2 parameters,
    *   a message (a String)
    *   and an array of integers,
    * and outputs the message and the array's contents to
    * the terminal window.
    */

    public static void printArray(String message, int[] array) {
        System.out.println(message + " " + Arrays.toString(array));
    }

    /*
    * Create a method that gets an array as a paramenter
    * The method returns the sum of the integers inside the array
    * @parameter array
    * @return int
    */
    public static int sum(int[] a) {

        // Loops through the array to find its sum
        int sum = 0;
        for (int number : a) {
            sum += number;
        }

        return sum;

    }

    /*
    * Create a method that repeat 3 times the elements inside an array
    * Method uses while loops untile the task ended
    * @return a string calling method printArray
    */
    public static void repeatElements(int[] a) {

        int[] array = new int[(a.length * 3)];

        Boolean flag = true;
        int count = 0;
        int i = 0;

        while (flag) {

            if (count < (a.length * 3)) {
                array[count] = a[i];
                count++;
                i++;

                if (i > (a.length - 1)) {
                    i = 0;
                }

            } else {
                flag = false;
            }

        }
       
        printArray("Array with three times elements: ", array);

    }

}