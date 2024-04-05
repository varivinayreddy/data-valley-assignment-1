public class MaxElementInArray {
    public static void main(String[] args) {
        int[] array = {5, 3, 9, 12, 4, 7}; // Example array

        int maxElement = findMax(array);

        System.out.println("The maximum element in the array is: " + maxElement);
    }

    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            throw new IllegalArgumentException("Array must not be empty or null");
        }

        int max = arr[0]; // Initialize max with the first element of the array

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if current element is greater
            }
        }

        return max;
    }
}
