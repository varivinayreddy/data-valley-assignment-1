import java.util.Arrays;

public class ArraySortingAndCounting {
    
    public static void main(String[] args) {
        int[] array = {5, 2, 7, 3, 2, 8, 2, 4, 9, 2}; // Example array
        int numberToFind = 2; // Number to find occurrences
        
        // Sort the array
        Arrays.sort(array);
        
        // Display sorted array
        System.out.println("Sorted Array: " + Arrays.toString(array));
        
        // Find occurrences of the number
        int occurrences = countOccurrences(array, numberToFind);
        
        // Display the number of occurrences
        System.out.println("Occurrences of " + numberToFind + ": " + occurrences);
    }
    
    // Method to count occurrences of a number in an array
    public static int countOccurrences(int[] array, int number) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                count++;
            }
        }
        return count;
    }
}
