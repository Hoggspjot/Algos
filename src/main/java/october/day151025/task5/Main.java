package october.day151025.task5;

import java.util.Scanner;
class StackX{
    int size;
    int[] stackArray;
    int top;
    StackX(int size){
        stackArray = new int[size];
        top = -1;

    }
    void push(int elem) {
        stackArray[++top] = elem;
    }

    // Извлечение элемента
    int pop() {
        return stackArray[top--];
    }
    int peek() {
        return stackArray[top];
    }
    boolean isEmpty() {
        return top == -1;
    }
    boolean isFull() {
        return (top == size - 1);
    }
}
public class Main {
    public static int findMin(StackX stack){
        int min = Integer.MAX_VALUE;
        while (!stack.isEmpty()){
            int num = stack.pop();
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] elements = str.split(" ");
        StackX stack = new StackX(elements.length);
        for (int i = 0; i < elements.length; i++) {
            stack.push(Integer.parseInt(elements[i]));
        }
        System.out.println(findMin(stack));
    }
}

//Написать метод для нахождения минимального элемента в стеке.