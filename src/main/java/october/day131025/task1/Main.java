package october.day131025.task1;

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

    public static boolean checkSLL(Node head) {
        Node current = head;

        boolean check = true;

        while (current.next != null) {
            if (Integer.parseInt(current.data) > Integer.parseInt(current.next.data)) {
                check = false;
            }
            current = current.next;
        }
        return check;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Node head = createSLLFromString(s);
        System.out.println(checkSLL(head));
    }
}

//Проверить расположены ли все элементы односвязного списка в порядке неубывания. Если да, вернуть true.
//Если нет, то вернуть false.