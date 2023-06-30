// Algorithms - Sorting
// Merge Sort O(n * log(n))

package sort;

public abstract class MergeSort {

    public static int[] Sort(int[] array) {
        MergeSort(array);
        return array;
    }

    private static void MergeSort(int[] array) {
        int length = array.length;
        if (length <= 1) return;

        int mid = length / 2;

        int[] leftArray, rightArray;
        leftArray = new int[mid];
        rightArray = new int[length - mid];

        int i=0, j=0;
        for (; i < length; i++) {
            if (i < mid)
                leftArray[i] = array[i];
            else {
                rightArray[j] = array[i];
                j++;
            }
        }

        MergeSort(leftArray);
        MergeSort(rightArray);
        Merge(leftArray, rightArray, array);
    }

    private static void Merge(int[] leftArray, int[] rightArray, int[] array) {
        int leftLength = array.length / 2;
        int rightLength = array.length - leftLength;

        int i=0, l=0, r=0;

        while (l < leftLength && r < rightLength) {
            if (leftArray[l] < rightArray[r]) {
                array[i] = leftArray[l];
                i++;
                l++;
            }
            else {
                array[i] = rightArray[r];
                i++;
                r++;
            }
        }

        while (l < leftLength) {
            array[i] = leftArray[l];
            i++;
            l++;
        }

        while (r < rightLength) {
            array[i] = rightArray[r];
            i++;
            r++;
        }
    }
}
