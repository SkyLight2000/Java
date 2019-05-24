package ua.edu.chmnu.fks.oop.lab_5;

public class Auditory {
    public static void main(String[] args) {
        OneLinkedList list = new OneLinkedList();
        list.addFirst(2);
        list.addLast(6);
        list.addLast(4);
        list.addLast(5);
        list.addLast(9);
        OneLinkedNode find = list.find(6);
        System.out.printf("%d is in list\n", find.getData());
        list.printList();
        //list.removeLast();
        list.reverseList();
        list.printList();
        System.out.printf("Length: %d\n", list.lengthList());
    }
}

