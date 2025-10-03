package october.day031025;

import java.util.Arrays;
import java.util.Random;

public class QuickSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        quickSortIdx(array);
        System.out.println(Arrays.toString(array));
    }


    public static void quickSortIdx(int[] arr) {
        if (arr == null || arr.length <= 1) return;
        quickSort(arr, 0, arr.length - 1);
    }

    public static void quickSort(int[] arr, int begin, int end) {

        if (begin < end) {
            int paritionIndex = partition(arr, begin, end);
            quickSort(arr, begin, paritionIndex - 1);
            quickSort(arr, paritionIndex + 1, end);
        }
    }

    public static int partition(int[] arr, int begin, int end) {
        int pivot = arr[end];
        int i = begin - 1;
        for (int j = begin; j < end; j++) {
            if (arr[j] <= pivot) {
                i++;
                int swapTemp = arr[i];
                arr[i] = arr[j];
                arr[j] = swapTemp;
            }
        }
        int swapTemp = arr[i + 1];
        arr[i + 1] = arr[end];
        arr[end] = swapTemp;
        return i + 1;
    }
}
