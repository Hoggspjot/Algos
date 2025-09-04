import java.util.Random;

public class BublSort {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }

        print(array);
        System.out.println();
        bSort(array);
        print(array);
    }

    public static void bSort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            for (int j = array.length - 1; j >= i; j--) {
                if (array[j - 1] > array[j]) {
                    int temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }
            }
        }


    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+ " ");
        }

    }
}
