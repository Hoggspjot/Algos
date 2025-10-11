package october.day111025.task1;

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
    public static Node delLastElemFromSLL(Node head, int value) {
        if (head == null) return null;


        Node current = head;
        Node search = null;
        while (current != null) {
            if (Integer.parseInt(current.data) == value) {
                search = current;
            }
            current = current.next;
        }
        if (search == null) {
            return head;
        } else {
            current = head;
            if (head.equals(search)) {
                return head.next;
            } else {
                while (current.next != null) {
                    if (current.next.equals(search)) {
                        current.next = current.next.next;
                    }else current = current.next;
                }
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
        head = delLastElemFromSLL(head, value);
        printSLL(head);
    }
}

//Удалить последнее появление элемента с значением value из односвязного списка.
// Если данный элемент отсутствует, то вывести исходный список.

//
//Node valNode = current;
//int idx = 0;
//int valIdx = 0;
//        while (current.next != null) {
//        if (Integer.parseInt(current.data) == value) {
//valNode = current;
//valIdx = idx;
//            }
//current = current.next;
//idx++;
//        }
//
//current = head;
//idx = 0;
//        while (current.next != null) {
//        if (idx == valIdx) {
//current.next = current.next.next;
//            } else {
//current = current.next;
//idx++;
//        }
//        }