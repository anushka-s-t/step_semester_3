import java.util.Arrays;

public class Main4 {
    static int[] mergeSortedArrays(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length + arr2.length];

        int i = 0;
        int j = 0;
        int k = 0;

        // Compare elements from both arrays and pick the smaller one
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] <= arr2[j]) {
                result[k] = arr1[i];
                i++;
            } else {
                result[k] = arr2[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements of arr1, if any
        while (i < arr1.length) {
            result[k] = arr1[i];
            i++;
            k++;
        }

        // Copy remaining elements of arr2, if any
        while (j < arr2.length) {
            result[k] = arr2[j];
            j++;
            k++;
        }

        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 9};

        int[] merged = mergeSortedArrays(arr1, arr2);

        // Expected Output: [1, 2, 3, 4, 5, 6, 7, 8, 9]
        System.out.println(Arrays.toString(merged));
    }
}
