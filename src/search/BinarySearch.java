// Algorithms - Searching
// Binary Search O(log(n))
package search;

public class BinarySearch {
    public static int Search(int[] array, int item) {
        int index = BinarySearch(array, 0, array.length-1, item);
        return index;
    }

    private static int BinarySearch(int[] array, int start, int end, int item) {
        int mid = start + (end - start) / 2;

        if (mid > end || mid < start)
            return -1;

        if (array[mid] == item)
            return mid;

        else if (array[mid] > item)
            return BinarySearch(array, start, mid-1, item);

        else if (array[mid] < item)
            return BinarySearch(array, mid+1, end, item);

        return -1;

    }
}
