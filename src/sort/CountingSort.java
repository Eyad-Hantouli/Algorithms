// Algorithms - Sorting
// Counting Sort O(n)

package sort;
import java.util.Arrays;

public abstract class CountingSort {
    public static int[] Sort (int[] array) {
        int [] sortedArray = new int[array.length];
        int [] indexesArray = BuildIndexedArray(array);

        for (int i : array) {
            sortedArray[indexesArray[i-1] - 1] = i;
            indexesArray[i-1] -= 1;
        }

        return sortedArray;
    }

    private static int[] BuildIndexedArray (int[] array) {
        int maxElement = Arrays.stream(array).max().getAsInt();
        int [] indexesArray = new int[maxElement];

        for (int i : array) {
            indexesArray[i-1] += 1;
        }

        for (int j = 1; j < maxElement; j++) {
            indexesArray[j] = indexesArray[j - 1] + indexesArray[j];
        }

        return indexesArray;
    }
}
