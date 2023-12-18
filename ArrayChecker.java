public class ArrayChecker {
    public static void main(String[] args) {
        // int[] arr = { 1, 4, 2, 7, 8, 3, 4 };
        int[] sortedArray = { 1, 2, 3, 4, 5 };
        int[] unsortedArray = { 5, 3, 1, 4, 2 };

        System.out.println("Is the sortedArray sorted? " + isArraySorted(sortedArray, 0));
        System.out.println("Is the unsortedArray sorted? " + isArraySorted(unsortedArray, 0));

    }

    public static boolean isArraySorted(int[] arr, int index) {
        // Base case: If the array has one or no elements, it is considered sorted
        if (index >= arr.length - 1) {
            return true;
        }

        // Recursive case: Check if the current element is greater than or equal to the
        // next element
        if (arr[index] > arr[index + 1]) {
            return false; // The array is not sorted
        }

        // Recursively check the rest of the array
        return isArraySorted(arr, index + 1);
    }
}
