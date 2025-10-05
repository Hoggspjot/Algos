package october.day051025;

import java.util.Scanner;
public class Main2 {
    public static void printArr(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int [] delElementFromArr(int[]arr, int index){
        int[] newArr = new int[arr.length - 1];
        for (int i = 0; i < index; i++) newArr[i] = arr[i];

        for (int i = index + 1; i < arr.length; i++) {
            newArr[i - 1] = arr[i];
        }
        return newArr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = sc.nextInt();
        arr = delElementFromArr(arr,index);
        printArr(arr);
    }
}

//Удалить заданный элемент массива по индексу (уменьшить размер исходного массива и сдвинуть элементы).