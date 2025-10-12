package october.day121025.task3;

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
    public static void addValue(Node head, int value) {
        Node current = head;
        while (current != null) {
            int val = Integer.parseInt(current.data);
            val += value;
            current.data = String.valueOf(val);
            current = current.next;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node head = createSLLFromString(s);
        addValue(head, value);
        printSLL(head);
    }
}

//Добавьте число value к каждому элементу односвязного списка.