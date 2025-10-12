package october.day121025.task2;

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
    public static Node combineTwoSLL(Node firstHead, Node secondHead) {
        Node firstCurrent = firstHead;
        Node secondCurrent = secondHead;

        Node head = firstCurrent;

        while (firstCurrent != null) {
            if (firstCurrent.next == null) {
                firstCurrent.next = secondCurrent;
                break;
            }
            firstCurrent = firstCurrent.next;
        }




        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strOne = sc.nextLine();
        Node firstList = createSLLFromString(strOne);
        String strTwo = sc.nextLine();
        Node secondList = createSLLFromString(strTwo);
        Node head = combineTwoSLL(firstList, secondList);
        printSLL(head);
    }
}

//Соедините два односвязных списка в один и выведите его.