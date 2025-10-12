package october.day121025.task1;

import java.util.Scanner;
class Node{
    String data;
    Node next;
    Node(String value) {
        this.data = value;
    }
}
public class Main {
    public static Node createSLLFromString(String s) {
        if(s.isEmpty()) return null;
        String[] strings = s.split(" ");
        Node head = new Node(strings[0]);
        Node current = head;
        for (int i = 1; i < strings.length; i++) {
            current.next = new Node(strings[i]);
            current = current.next;
        }
        return head;
    }
    public static int findFirstIndexWithValueInSLL(Node head, int value) {
        int index = -1;

        Node current = head;
        int idx = 0;
        while (current != null) {
            if (Integer.parseInt(current.data) == value) {
                index = idx;
                return index;
            }
            current = current.next;
            idx++;
        }

        return index;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node head = createSLLFromString(s);
        System.out.println(findFirstIndexWithValueInSLL(head, value));
    }
}
//Напишите метод, который возвращает позицию первого вхождения элемента с значением value в односвязном списке.
//Если элемент с значением value отсутствует возвращается -1. Позиция начинается с нуля.