package sort;

import java.util.Arrays;

public abstract class InserionSort {
    public static int[] Sort(int[] array) {
        int length = array.length;
        int temp, currentItem;

        for (int i=1; i<length; i++) {
            currentItem = i;
            while (currentItem != 0 && array[currentItem] < array[currentItem - 1]) {
                temp = array[currentItem - 1];
                array[currentItem - 1] = array[currentItem];
                array[currentItem] = temp;
                currentItem--;
            }
        }

        return array;
    }

}
