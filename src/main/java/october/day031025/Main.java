package october.day031025;

import java.util.HashMap;
import java.util.Scanner;
public class Main {
    public static int uniqueValues(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (map.containsKey(arr[i])) {
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
                map.put(arr[i], 1);
            }
        }

        return map.size();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(uniqueValues(arr));
    }
}

//Написать метод uniqueValues(), который определяет количество уникальных значений в одномерном массиве (возможны повторы).