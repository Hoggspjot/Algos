package october.day031025;

import java.util.Arrays;
import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        mergeSortOb(array);
        System.out.println(Arrays.toString(array));
    }


    public static void mergeSortOb(int[] arr) {
        //arr[] - исходный массив
        //l - левый индекс
        //r - правый индекс
        // для удобства создаем метод обертку, то есть этот метод
        if(arr == null || arr.length <=1) return;
        mergeSort(arr, 0 , arr.length - 1);
    }

    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            //нахождение середины
            int m = l + (r - l) / 2;

            //Сортировка первой и второй части массива
            mergeSort(arr, l, m);
            mergeSort(arr, m + 1, r);

            // Объединение отсортированных частей массива
            merge(arr, l, m, r);
        }
    }

    public static void merge(int[] arr, int l, int m, int r) {
            //Нахождение размеров двух массивов для объединения
        int n1 = m - l + 1;
        int n2 = r - m;

        //Создание временных массивов
        int[] L = new int[n1];
        int[] R = new int[n2];

        //Копирование значений в временные массивы
        for (int i = 0; i < n1; i++) {
            L[i] = arr[l + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = arr[m + 1 + i];
        }

        //Объединение двух временных массивов
        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        //Копирование оставшихся элементов L[], если они есть
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
        //Копирование оставшихся элементов в R[], если они есть
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}