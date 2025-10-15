package october.day151025.task4;

import java.util.Scanner;
public class Main {
    public static int fact(int value){
        if (value == 1) {
            return 1;
        } else {
            return value * fact(value - 1);
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        System.out.println(fact(value));
    }
}