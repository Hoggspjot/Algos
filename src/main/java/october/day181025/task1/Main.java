package october.day181025.task1;

import java.util.*;

public class Main {
   public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (valueToIndex.containsKey(complement)) {
                return new int[]{valueToIndex.get(complement), i};
            }
            valueToIndex.put(nums[i], i);
        }
        throw new IllegalStateException("Нет подходящих чисел");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int target = scanner.nextInt();
        scanner.nextLine();
        String line = scanner.nextLine().trim();
        String[] tokens = line.split("\\s+");
        int[] nums = new int[tokens.length];
        for (int i = 0; i < tokens.length; i++) {
            nums[i] = Integer.parseInt(tokens[i]);
        }
        int[] result = twoSum(nums, target);
        System.out.println(result[0] + " " + result[1]);
    }
}

//Дан массив целых чисел nums и целое число target.
//Нужно найти индексы двух различных элементов в массиве, сумма которых равна target.
//Можно считать, что решение всегда существует, и каждая пара уникальна.
