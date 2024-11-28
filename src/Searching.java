class Node{
    int data;
    Node next;

    public  Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class Searching {
    public static void main(String[] args) {
        Node head = new Node(20);
        head.next = new Node(30);
        head.next.next = new Node(40);
        boolean find = search(head,40);

    }
    public static boolean search(Node head, int target){
        while(head != null){
            if(head.data == target){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}
