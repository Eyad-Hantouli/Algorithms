// Algorithms - Searching
// Interpolation Search O(n)
package search;

public abstract class InterpolationSearch {
    public static int Search(int[] array, int item) {
        int index = InterpolationSearch(array, 0, array.length-1, item);
        return index;
    }

    private static int InterpolationSearch(int[] array, int start, int end, int item) {
        if (start > end || item < array[start] || item > array[end])
            return -1;

        int probe = start + (end - start) * (item - array[start]) / (array[end] - array[start]);

        if (array[probe] == item)
            return probe;

        else if (array[probe] < item)
            return InterpolationSearch(array, probe+1, end, item);

        else if (array[probe] > item)
            return InterpolationSearch(array, start, probe-1, item);

        return -1;
    }
}
