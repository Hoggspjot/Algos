package october.day041025;

import java.util.Scanner;
public class Main {
    public static void printSumAndAvg(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        double avg = (double) sum / arr.length;

        System.out.printf("%d %.1f",sum,avg);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        printSumAndAvg(arr);
    }
}

//Написать метод printSumAndAvg(),
// который выводит сумму и среднее арифметическое (с округлением до одного знака после запятой) в одномерном массиве.