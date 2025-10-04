package CircularLinkedList;

public class ll {

    private Node head;
    private Node tail;

    ll(){
        head = null;
        tail = null;
    }

    private class Node{
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }
    }

    public void insert(int val){
        Node node = new Node(val);
        if(head == null){
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;

    }

    public void display(){
        Node node = head;
        if(head!=null){
            do{
                System.out.print(node.val + " -> ");
                node = node.next;
            }while(node!=head);
        }
        System.out.println("HEAD");
    }




}
