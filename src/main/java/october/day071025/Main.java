package october.day071025;

import java.util.Scanner;
public class Main {
    public static double findSumAvgLines(int[][] arr) {
        double allSum = 0.0;
        for (int i = 0; i < arr.length; i++) {
            double sum = 0.0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            allSum += sum / arr[i].length;
        }

        return allSum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findSumAvgLines(arr));
    }
}


//Написать метод, определяющий сумму средних арифметических каждой из строк двухмерного массива типа int размерностью 2 x 2.
//Сумма должна выводится с округлением до одного знака после запятой.