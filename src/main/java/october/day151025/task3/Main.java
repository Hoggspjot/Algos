package october.day151025.task3;

import java.util.Scanner;
public class Main {
    public static void decToBin(int value){
        if (value / 2 == 0) {
            System.out.print(value % 2);
        } else {
            decToBin(value / 2);
            System.out.print(value % 2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        decToBin(value);
    }
}

//Написать рекурсивный метод для перевода числа из десятичной системы счисления в двоичную.