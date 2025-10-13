package october.day131025.task2;

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
    public static Node mergeTwoSLL(Node firstHead, Node secondHead) {

        Node firstCurrent = firstHead;
        Node secondCurrent = secondHead;


        Node temp = new Node("0");
        Node current = temp;

        while (firstCurrent != null && secondCurrent != null) {
            if (Integer.parseInt(firstCurrent.data) < Integer.parseInt(secondCurrent.data)) {
                current.next = firstCurrent;
                firstCurrent = firstCurrent.next;
            } else {
                current.next = secondCurrent;
                secondCurrent = secondCurrent.next;
            }
            current = current.next;
        }

        while (firstCurrent != null) {
            current.next = firstCurrent;
            current = current.next;
            firstCurrent = firstCurrent.next;
        }

        while (secondCurrent != null) {
            current.next = secondCurrent;
            current = current.next;
            secondCurrent = secondCurrent.next;
        }

        return temp.next;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String strOne = sc.nextLine();
        Node firstList = createSLLFromString(strOne);
        String strTwo = sc.nextLine();
        Node secondList = createSLLFromString(strTwo);
        Node head = mergeTwoSLL(firstList, secondList);
        printSLL(head);
    }
}

//Объедините два односвязных списка в порядке возрастания значений их элементов.
//Исходные списки уже отсортированы.