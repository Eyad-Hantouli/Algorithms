// Algorithms - Searching
// Linear Search O(n)
package search;

public abstract class LinearSearch {
    public static int Search(int[] array, int item) {
        int length = array.length;

        for(int i = 0; i < length; i++) {
            if(array[i] == item)
                return i;
        }

        return -1;
    }
}
