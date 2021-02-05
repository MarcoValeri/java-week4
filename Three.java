import java.util.Arrays;

public class Three {

    /*
    * Create a method that shift all elements by on to the right
    * @parameter int array
    * @return array
    */
    public static void shiftRight(int[] array) {

        int[] new_array = new int[(array.length)];

        for (int i = 0; i < array.length; i++) {
            
            if (array[i] == array[array.length - 1]) {
                new_array[0] = array[i];
            } else if (array[i] == array[0]) {
                new_array[array.length - 1] = array[0];
            } else {
                new_array[i] = array[i];
            }

        }

        outputArray(new_array);

    }

    /*
    * Create a method that gets
    * @parameter int array
    * @retrn print out its elements as strings
    */
    public static void outputArray(int[] array) {
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args) {

        int[] array = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

        // Shifts all array's elements by one
        shiftRight(array);

    }

}