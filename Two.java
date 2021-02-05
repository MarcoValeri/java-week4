import java.util.Scanner;
import java.util.Arrays;

public class Two {

    /*
    * Create a method that
    * @parameter gets an int array
    * @return and print out its elements as string
    */
    public static void outputArray(int[] array) {
        System.out.print(Arrays.toString(array));
    }

    /*
    * Create a method that
    * @parameter gets an int array
    * @return an array where the even number are replaced with 0
    */
    public static void replaceEven(int[] array) {

        for (int i = 0; i < array.length; i++) {
            
            if ((array[i] % 2) == 0) {
                array[i] = 0;
            } 

        }

        outputArray(array);

    }

    public static void main(String[] args) {

        // Create an empty array with a length of 10 elements
        int[] array = new int[10];

        // Gets array's element by user's input
        System.out.println("Please, insert 7 integers:");
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < array.length; i++) {
            System.out.print("Integer number " + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        input.close();

        // Print out the array
        System.out.println("These are your numbers: ");
        outputArray(array);

        // Replace array's even number with 0
        System.out.println("\nReplaced array's even number with 0:");
        replaceEven(array);

    }

}