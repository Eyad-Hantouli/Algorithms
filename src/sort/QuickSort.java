// Algorithms - Sorting
// Quick Sort O(n ^ 2)
package sort;

public abstract class QuickSort {
    public static int[] Sort(int[] array) {
        QuickSort(array, 0, array.length-1);
        return array;
    }

    private static void QuickSort(int[] array, int start, int end) {
        if (start > end)
            return;

        int pivotIndex = Partition(array, start, end);
        QuickSort(array, start, pivotIndex-1);
        QuickSort(array, pivotIndex+1, end);
    }

    private static int Partition(int[] array, int start, int end) {
        // Pivot Element Will Be The Last Element (There is better ways to select it but I choices this way 8>)
        int pivotIndex = end;
        int i=start-1, j=start;

        while (j <= pivotIndex) {
            if (array[j] < array[pivotIndex]) {
                i++;
                Swap(array, i, j);
            }
            j++;
        }
        i++;

        Swap(array, i, pivotIndex);
        return i;
    }

    private static void Swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
}
