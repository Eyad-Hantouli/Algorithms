// Algorithms - Sorting
// Buuble Sort O(n^2)

package sort;

public abstract class BubbleSort {
    public static int[] Sort(int[] array) {
        int length = array.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    Swap(array, j, j + 1);
                }
            }
        }

        return array;
    }

    private static void Swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
