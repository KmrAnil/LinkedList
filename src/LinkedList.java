
import java.util.Scanner;

class Node {
    Integer data;
    Node next= null;
    Node(Integer data) {
        this.data = data;
    }
}

public class LinkedList {
    Node head = null;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of LinkList to create");
        int n = scanner.nextInt();
        System.out.println("Add the " + n + " element in LinkList");
        for (int i = 0; i < n; i++) {
            ll.insertNodeAtTail(scanner.nextInt());
        }

        ll.insertNodeAtHead(4);

        ll.printLinkList();

        ll.countLinkList();


    }

    private void countLinkList() {
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        System.out.println("Linked List size is "+count);
    }

    private void insertNodeAtHead(int data) {
        Node n = new Node(data);
        n.next=head;
        head=n;
    }

    private void printLinkList() {
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    private void insertNodeAtTail(int data) {
        Node n = new Node(data);
        if (head == null) {
            head = n;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = n;
    }
}

