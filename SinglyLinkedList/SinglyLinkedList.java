import java.util.Scanner;
class SinglyLinkedList
{
    Node head;
    class Node
    {
        int data;
        Node next;
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
    public void insertAtEnd(int new_data)
    {
        Node new_node = new Node(new_data);
        if (head == null)
        {
          head = new Node(new_data);
          return;
        }
        new_node.next = null;
        Node last = head;
        while (last.next != null)
          last = last.next;
        last.next = new_node;
        return;
    }
    void deleteNode(int position)
    {
        if (head == null)
            return;
        Node temp = head;
        if (position == 0)
        {
            head = temp.next;
            return;
        }
        for(int i=0;temp!=null&&i<position-1;i++)
            temp = temp.next;
        if (temp == null || temp.next == null)
            return;
        Node next = temp.next.next;
        temp.next = next;
    }
    public void printList()
    {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }
    public static void main(String[] args)
    {
        int ch,n,k;
        Scanner in=new Scanner(System.in);
        SinglyLinkedList llist=new SinglyLinkedList();
        do
        {
            System.out.println("1.Insert node");
            System.out.println("2.Delete node");
            System.out.println("3.Print list");
            System.out.println("4.Exit");
            System.out.println("\nEnter an option : ");
            ch=in.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.println("Enter the element to insert : ");
                    n=in.nextInt();
                    llist.insertAtEnd(n);
                    break;
                case 2:
                    System.out.println("Enter the position of element to be deleted : ");
                    k=in.nextInt();
                    llist.deleteNode(k);
                    break;
                case 3:
                    System.out.println("Linked list : ");
                    llist.printList();
                    System.out.println("\n\n");
                    break;    
            }
        }while(ch<4);
    }
}