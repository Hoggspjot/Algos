package october.day071025;

import java.util.Scanner;
public class Main2 {
    public static double findAvgOddElem(int[][] arr){
        double sum = 0.0;
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 != 0) {
                    sum += arr[i][j];
                    count++;
                }
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return Math.round((sum / count) * 10) / 10.0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(findAvgOddElem(arr));
    }
}


//Написать метод, определяющий среднее арифметическое нечетных элементов двухмерного массива
// типа int размерностью 3 x 3. Cреднее арифметическое должно выводится с округлением до
// одного знака после запятой. При отсутствии нечетных элементов возвратить 0.