package october.day111025.task2;

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

    public static int countElemInSLL(Node head, int value) {
        int count = 0;

        Node current = head;
        while (current != null) {
            if (Integer.parseInt(current.data) == value) {
                count++;
            }
            current = current.next;
        }

        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node head = createSLLFromString(s);
        System.out.println(countElemInSLL(head, value));
    }
}


//Выведите количество элементов с значением value в односвязном списке.