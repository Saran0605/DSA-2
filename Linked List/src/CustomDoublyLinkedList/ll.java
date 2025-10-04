package CustomDoublyLinkedList;

public class ll {
    Node head;

    private class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val = val;
        }
        Node(int val,Node prev,Node next){
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    //insert at first

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev = node;
        }
        head = node;
    }

    //displaying the list
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;

        }
        System.out.println("END");
    }

    //displaying the list in reverse
    public void dispRev(){
        //No tail so getting the last element
        Node temp = head;
        Node last = null;
        while(temp!=null){
            last = temp;
            temp = temp.next;

        }

        while(last!=null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    //insert at last
    public void insertLast(int val){
        Node node  = new Node(val);
        Node temp = head;
        Node last = null;
        while(temp!=null){
            last = temp;
            temp = temp.next;
        }
        last.next = node;
        node.prev = last;
        node.next = null;

    }
    public void insertPart(int index,int val){
        Node temp= get(index-1);
        Node node = new Node(val);
        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;


    }

    public Node get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    //delete at particular index

    public void deletePart(int index){
        Node temp = get(index-1);
        temp.next = temp.next.next;
        temp.next.next.prev = temp;


    }
}
