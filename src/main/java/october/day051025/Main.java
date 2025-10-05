package october.day051025;

import java.util.Scanner;
public class Main {
    public static int findSameInLine(int[] arr) {
       int count = 1;
       int maxCount = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] == arr[i]) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 1;
            }
        }


        return maxCount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(findSameInLine(arr));
    }
}


//Написать метод определяющий наибольшее
// число одинаковых идущих подряд элементов одномерного массива типа int, при их отсутствии возвращается 1.