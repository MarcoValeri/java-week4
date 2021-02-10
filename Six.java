public class Six {

    /*
    * Create a method that gets as 
    * @parameter an array of integers and
    * @returns boolean true value if the array contins 
    * two adjacent duplicate elements
    */
    public static Boolean duplicateElements(int[] array) {

        Boolean output = false;

        for (int i = 0; i < array.length; i++) {

            if (array[i] == array[i + 1]) {
                return output = true;
            } 

        }

        return output;

    }

    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        
        if (duplicateElements(numbers)) {
            System.out.println("Your array contains two adjacent duplicate elements");
        } else {
            System.out.println("Your array does not contain two adjacent duplicate elements");
        }
    }
}