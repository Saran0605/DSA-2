package CustomDoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        ll list = new ll();
        list.insertFirst(1);
        list.insertFirst(2);
        list.insertFirst(3);
        list.insertFirst(4);
        list.insertFirst(5);
        list.display();
        list.dispRev();
        list.insertLast(100);
        list.display();
        list.insertPart(2,18);
        list.display();
        list.deletePart(2);
        list.display();
    }
}
