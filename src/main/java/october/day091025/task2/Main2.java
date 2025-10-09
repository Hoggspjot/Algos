package october.day091025.task2;

import java.util.Scanner;
class Node{
    String data;
    public Node next;
    Node(String value) {
        this.data = value;
    }
}
public class Main2 {
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
    public static boolean checkValue(Node head, int value){
        Node current = head;
        boolean flag = false;
        while (current != null) {
            int checkV = Integer.parseInt(current.data);
            if (checkV == value) {
                return true;
            }
            current = current.next;
        }
        return flag;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node head = createSLLFromString(s);
        System.out.println(checkValue(head,value));
    }
}


//Создать метод, который проверяет,  есть ли конкретное значение value в исходном списке.