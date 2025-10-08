package october.day081025;

import java.util.Scanner;
public class Main2 {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void changeSignForElem(int k, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % k == 0) {
                arr[i] = arr[i] * -1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        changeSignForElem(k, arr);
        printArr(arr);
    }
}

//Написать метод который меняет знак на противоположный
// у всех элементов одномерного массива (размерностью 5) кратных k, где k - целое число.