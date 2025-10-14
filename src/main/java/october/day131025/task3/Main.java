package october.day131025.task3;

import java.util.Arrays;
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
        int[] arr = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            arr[i] = Integer.parseInt(strings[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            strings[i] = String.valueOf(arr[i]);
        }
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
                firstCurrent = firstCurrent.next;
            }else if (Integer.parseInt(firstCurrent.data) == Integer.parseInt(secondCurrent.data)) {
                current.next = new Node(firstCurrent.data);
                current = current.next;

                String val = firstCurrent.data;

                while (firstCurrent != null && firstCurrent.data.equals(val)) firstCurrent = firstCurrent.next;
                while (secondCurrent!= null && secondCurrent.data.equals(val)) secondCurrent = secondCurrent.next;

            } else if (Integer.parseInt(firstCurrent.data) > Integer.parseInt(secondCurrent.data)) {
                secondCurrent = secondCurrent.next;
            }
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

//Объедините два односвязных списка, включив в итоговой список, только те элементы которые присутствуют
//в обоих списках (без дубликатов). Исходные списки уже отсортированы.