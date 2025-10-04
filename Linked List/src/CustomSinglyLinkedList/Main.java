package CustomSinglyLinkedList;

public class Main {
    public static void main(String[] args) {
        ll list = new ll();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.display();
        list.insertLast(100);
        list.display();
        list.insert(200,3);
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.deleteAtparticular(1));
        list.display();


    }

}
