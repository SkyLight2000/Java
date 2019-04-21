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

class OneLinkedNode{
    private int data;
    public OneLinkedNode next = null;

    public OneLinkedNode(int data, OneLinkedNode next){
        this.data = data;
        this.next = next;
    }

    public OneLinkedNode(int data){
        this.data = data;
    }

    public int getData(){
        return data;
    }

    public void setData(int data){
        this.data = data;
    }

    public OneLinkedNode getNext(){
        return next;
    }

    public void setNext(OneLinkedNode next){
        this.next = next;
    }

    public OneLinkedNode next(){
        return next != null ? next: null;
    }
}

class OneLinkedList{
    private OneLinkedNode root = null;
    public void addFirst(int data){
        if(root == null){
            root = new OneLinkedNode(data);
        }
        else{
            root = new OneLinkedNode(data, root);
        }
    }

    public void addLast(int data){
        if(root == null){
            addFirst(data);
        }
        else{
            OneLinkedNode node = root;
            while(node.next() != null){
                node = node.next();
            }
            node.setNext(new OneLinkedNode(data));
        }
    }

    public void removeFirst(){
        if(root != null){
            OneLinkedNode node = root;
            root.setNext(null);
            root = node;
        }
    }

    public void removeLast(){
        OneLinkedNode node = root;
        if(root != null) {
            while(node.next() != null) {
                //System.out.printf(" " + node.getData());
                //root = node;
                node = node.next();
            }
            root.setNext(null);
            root = node;
            System.out.println();
        }
    }

    public OneLinkedNode find(int data) {
        OneLinkedNode node = root;
        while(node != null && node.getData() != data){
            node = node.next();
        }
        return node;
    }

    public void printList(){
        OneLinkedNode node = root;
        while(node != null){
            System.out.printf(" " + node.getData());
            node = node.next();
        }
        System.out.println();
    }

    public void reverseList()
    {
        OneLinkedNode node = root;
        OneLinkedNode previous = null;
        OneLinkedNode previous1 = null;
        while(node.getNext() != null)
        {
            if(node == root)
            {
                previous = node;
                node = node.getNext();
                previous.setNext(null);
            }
            else
            {
                previous1 = node;
                node = node.getNext();
                previous1.setNext(previous);
                previous = previous1;
            }
        }
        node.setNext(previous);
        root = node;
    }

    public int lengthList(){
        OneLinkedNode node = root;
        int count = 0;
        if(node != null){
            count++;
            while(node != null && node.next() != null){
                count++;
                node = node.next();
            }
        }
        return count;
    }
}