package october.day081025;

import java.util.Scanner;
public class Main {
    public static int[] findIndexAndValue(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double)sum / arr.length;

        int numIdx = 0;
        double razn = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - avg) < razn) {
                razn = Math.abs (avg - arr[i]);
                numIdx = i;
            }
        }
        int[] retArr = {numIdx, arr[numIdx]};
        return retArr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        int index = findIndexAndValue(arr)[0];
        int value = findIndexAndValue(arr)[1];
        System.out.println(index + " " + value);
    }
}


//Написать метод находящий индекс и значение элемента одномерного массива типа int
// (размерностью 5) наиболее приближенного к среднему арифметическому.
// При одинаковых значениях в массиве должен вернуться первый элемент (индекс, значение).