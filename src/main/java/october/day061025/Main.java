package october.day061025;

import java.util.Scanner;
public class Main {
    public static int findCountElemAboveAvg(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        double tenPers = Math.abs(avg * 0.10);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i] - avg) < tenPers) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findCountElemAboveAvg(arr));
    }
}



//Найти количество элементов в одномерном массиве типа int, которые отличаются от
//среднего арифметического менее чем на 10%.