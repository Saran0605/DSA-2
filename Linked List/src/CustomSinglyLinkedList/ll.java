package CustomSinglyLinkedList;

public class ll {

    private Node head;
    private Node tail;
    private int size;

    public ll(){
        this.size = 0;
    }



//Node creator
    private class Node{
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
        public Node(int value,Node next){
            this.value = value;
            this.next = next;
        }
    }

    //Insert at the beginning
    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null){
            tail = head;
        }
        size ++;
    }
    //print the list
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value+" -> ");
            temp = temp.next;
        }
        System.out.println("End");


    }

    // insert at last
    public void insertLast(int val){
        Node node = new Node(val);
        if(tail==null){
            insertFirst(val);
            return;
        }

            tail.next = node;
            tail = node;

        size++;
    }

    //insert at position
    public void insert(int val,int index){
        if(index==0){
            insertFirst(val);
            return;
        }
        if(index==size){
            insertLast(val);
            return;
        }
        Node temp = head;

        for(int i=1;i<index;i++){
            temp = temp.next;
        }
        Node node = new Node(val,temp.next);
        temp.next = node;

        size++;

    }

    //delete at first
    public int deleteFirst(){
        int val = head.value;
        head = head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        Node secondLast = get(size - 2);
        int val = tail.value;
        tail = secondLast;
        tail.next = null;
        size--;
        return val;
    }
//get a node at particular index
    public Node get(int index){
        Node temp = head;
        for(int i=0;i<index;i++){
            temp = temp.next;
        }
        return temp;
    }

    //delete at particular index
    public int deleteAtparticular(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }
//getting previous node to change link
        Node node = get(index-1);
        int val = node.next.value;
        node.next = node.next.next;
        size--;
        return val;
    }


}
