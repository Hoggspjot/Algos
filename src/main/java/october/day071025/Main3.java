package october.day071025;

import java.util.Scanner;
public class Main3 {
    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static int [] shiftValuesInArr(int[] arr, int shift) {
        int[] newArr = new int[arr.length];
        int newIdx = Math.abs(arr.length - shift);
        for (int i = 0; i < arr.length; i++) {
            if (i + shift <= arr.length - 1) {
                newArr[i + shift] = arr[i];
            } else {
                newArr[i + shift - arr.length] = arr[i];
            }
        }

        return newArr;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        arr = shiftValuesInArr(arr, s);
        printArr(arr);
    }
}


//Написать метод,
// который выполняет циклический сдвиг вправо элементов
// одномерного массива размерностью 5 на заданное s (целое положительное число).