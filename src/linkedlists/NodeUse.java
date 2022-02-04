package linkedlists;

/**
 * @author amgarg
 */
public class NodeUse {



    public static void circularLinkedList() {

        Node head = new Node(1);

        Node node2 = new Node(2);

        Node node3 = new Node(3);

        head.next = node2;
        node2.prev = head;

        node2.next = node3;

        node3.prev = node2;
        node3.next = head;


        Node temp = head.next;
        while(temp != head) {

            System.out.println(temp.data);
            temp = temp.next;
        }





        System.out.println(node2.prev.data);

    }

    public static void main(String[] args) {

        Node node = new Node(5);


       // System.out.println(node);

        Node node2 = new Node(6);

        node.next = node2;

        Node node3 = new Node(7);

        node2.next = node3;


        Node head = node;

      //  System.out.println(head);

        int index = 0;

        while(index < 2) {
            head = head.next;
            index++;
        }

        head = node;

        while(head.data != 6) {
            head = head.next;
        }

        Node temp = head.next;

        Node newNode = new Node(4);
        head.next = newNode;
        newNode.next = temp;

     //   System.out.println(head.data);


        head = node;

     /*   while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }*/
        head = node;

        Node rest = head.next;

        head.next = null;

        head = rest;

        while(head != null) {
            System.out.println(head.data);
            head = head.next;
        }

         head = rest;
        Node fast = head;
        Node slow = head;

        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        System.out.println(slow.data);

        circularLinkedList();

    }
}
