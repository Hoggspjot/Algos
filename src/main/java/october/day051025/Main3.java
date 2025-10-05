package october.day051025;

import java.util.Scanner;
public class Main3 {
    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void switchMinMax(int [] arr){
        int min = arr[0];
        int minIdx = 0;
        int max = arr[0];
        int maxIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIdx = i;
            }
            if (arr[i] < min) {
                min = arr[i];
               minIdx = i;
            }
        }
        int temp = arr[minIdx];
        arr[minIdx] = arr[maxIdx];
        arr[maxIdx] = temp;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        switchMinMax(arr);
        printArr(arr);
    }
}

//Написать метод switchMinMax(),
// который принимает одномерный массив типа int, находит минимальный и максимальный элемент и меняет их местами.