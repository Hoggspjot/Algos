package october.day151025.task2;

import java.util.Scanner;
class Stack {
    int size;
    String [] stackArray;
    int top;
    Stack(int size) {
        stackArray = new String[size];
        top = -1;
    }
    // Добавление элемента
    void push(String elem) {
        stackArray[++top] = elem;
    }
    // Извлечение элемента
    String pop() {
        return stackArray[top--];
    }
    // Чтение элемента
    String peek() {
        return stackArray[top];
    }
    // Проверка на пустоту
    boolean isEmpty() {
        return top == -1;
    }
    // Проверка на заполнение
    boolean isFull() {
        return (top == size - 1);
    }
}
public class Main{
    public static String reverseString(String s){
        String reverseS = "";
        Stack stack = new Stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.push(String.valueOf(s.charAt(i)));
        }
        while (!stack.isEmpty()) {
            reverseS += stack.pop();
        }

        return reverseS;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(reverseString(s));
    }
}

//Написать метод осуществляющий переворот строки с помощью стека.