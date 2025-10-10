package october.day101025.task2;

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
    public static void printSLL(Node head) {
        Node current = head;
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) {
                System.out.print("->");
            }
            current = current.next;
        }
    }
    public static Node delALlElemFromSLL(Node head, int value) {
        if (head == null) {
            return null;
        }

        while (head != null && Integer.parseInt(head.data) == value) {
            head = head.next;
        }
        if (head == null) {
            return null;
        }

        Node current = head;

        while (current.next != null) {
            if (Integer.parseInt(current.next.data) == value) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node head = createSLLFromString(s);
        head = delALlElemFromSLL(head, value);
        printSLL(head);
    }
}


//Удалить все элементы с значением равным value из односвязного списка.
// Если данные элементы отсутствует, то вывести исходный список.
