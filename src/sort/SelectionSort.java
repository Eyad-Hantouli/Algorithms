// Algorithms - Sorting
// Selection Sort O(n ^ 2)
package sort;

public abstract class SelectionSort {
    public static int[] Sort(int[] array) {
        SelectionSort(0, array);
        return array;
    }

    private static void SelectionSort(int start, int[] array) {
        int length = array.length;
        if (start >= length)
            return;

        int minIndex = start;
        int temp;

        for(int i = start; i < length; i++) {
            if (array[i] < array[minIndex])
                minIndex = i;
        }

        temp = array[start];
        array[start] = array[minIndex];
        array[minIndex] = temp;

        SelectionSort(start + 1, array);
    }
}
