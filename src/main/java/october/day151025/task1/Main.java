package october.day151025.task1;


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
    public static Stack createStackFromString(String s){
        String[] strings = s.split(" ");
        Stack stack = new Stack(strings.length);
        for (int i = 0; i < strings.length; i++) {
            stack.push(strings[i]);
        }
        return stack;
    }
    public static void printStackElements(Stack stack){
        while (!stack.isEmpty()) {
            System.out.print(stack.pop()+" ");

        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Stack stack = createStackFromString(s);
        printStackElements(stack);
    }
}

//Реализовать стек состоящий из слов исходной вводимой строки.