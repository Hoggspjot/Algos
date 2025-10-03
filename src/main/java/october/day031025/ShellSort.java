package october.day031025;

import java.util.Arrays;
import java.util.Random;

public class ShellSort {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];

        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        System.out.println(Arrays.toString(array));
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }


    public static void shellSort(int[] arr) {
        int n = arr.length;
        //gap значение промежутка
        for (int gap = n / 2; gap > 0; gap /= 2) {
            for (int i = gap; i < n ; i++) {
                int temp = arr[i];
                int j;
                for (j = i; j >= gap && arr[j - gap] > temp; j -= gap) arr[j] = arr[j - gap];
                arr[j] = temp;
                }
            }
        }
    }


