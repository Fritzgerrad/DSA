package DataStructures.LinkedList;

import DataStructures.Node.DoubleNode;
import DataStructures.Node.SingleNode;

public class DoubleLinkedList implements LinkedList{
    private DoubleNode head;
    private int length;
    private DoubleNode tail;

    public DoubleLinkedList(){
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    @Override
    public int getLength() {
        return this.length;
    }

    @Override
    public void add(int data) {
        DoubleNode doubleNode = new DoubleNode(data);
        if(this.head == null){
            this.head = doubleNode;
            this.tail = head;
        } else{
            this.tail.setNext(doubleNode);
            doubleNode.setPrev(this.tail);
            this.tail = doubleNode;
        }
        this.length++;
        return;
    }

    @Override
    public void pop() {
        if(this.head == null){
            return;
        }
        else {
            DoubleNode temp = this.tail;
            this.tail = this.tail.getPrev();
            this.tail.setNext(null);
            temp = null;
        }
        this.length --;
        return;
    }

    @Override
    public int find(int data) {
        if(this.head == null){
            return -1;
        }else{
            int pos = 0;
            DoubleNode curr = this.head;
            while(curr != null){
                if(curr.getValue() == data){
                    return pos;
                }
                else{
                    curr = curr.getNext();
                    pos ++;
                }
            }
        }
        return  -1;
    }

    @Override
    public DoubleNode nodeAt(int index) {
        int mid = this.length / 2;
        if(index >= length){
            return null;
        }
        if(index < mid){
            int pos = 0;
            DoubleNode curr = this.head;
            while(curr != null){
                if(pos == index){
                    return curr;
                }
                curr = curr.getNext();
                pos ++;
            }
        }
        else{
            int pos = this.length - 1;
            DoubleNode curr = this.tail;
            while(curr != null){
                if(pos == index){
                    return curr;
                }
                curr = curr.getPrev();
                pos --;
            }
        }
        return null;
    }

    @Override
    public int valueAt(int index) {
        DoubleNode node  = this.nodeAt(index);
        if(node == null){
            return -1;
        }
        return node.getValue();
    }

    @Override
    public void insertAt(int index, int value) {
        DoubleNode node = this.nodeAt(index);
        if(node == null){
            return;
        }
        DoubleNode newNode = new DoubleNode(value);
        newNode.setNext(node);
        node.getPrev().setNext(newNode);
        newNode.setPrev(node.getPrev());
        node.setPrev(newNode);
        this.length ++;
        return;
    }

    @Override
    public void deleteAt(int index) {
        DoubleNode node = this.nodeAt(index);
        if(node == null){
            return;
        }
        node.getPrev().setNext(node.getNext());
        node.getNext().setPrev(node.getPrev());
        node = null;
        this.length --;
    }

    @Override
    public String toString(){
        StringBuilder str = new StringBuilder();
        DoubleNode curr = this.head;
        while (curr.getNext() != null){
            str.append(curr.getValue());
            str.append("<->");
            curr = curr.getNext();
        }
        str.append(curr.getValue());
        return str.toString();
    }

    public static void test(int [] testArray){
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        for (int i : testArray){
            doubleLinkedList.add(i);
        }

        System.out.println("Initial Linked List");
        System.out.println(doubleLinkedList);
        System.out.println(" ");

        System.out.println("After removing the last element");
        doubleLinkedList.pop();
        System.out.println(doubleLinkedList);
        System.out.println(" ");

        int data = 14;
        int index =doubleLinkedList.find(data);
        System.out.println("The value "+data+ " is at index "+index);
        System.out.println(" ");

        System.out.println("After inserting 30 at index 5");
        doubleLinkedList.insertAt(5,30);
        System.out.println(doubleLinkedList);
        System.out.println(" ");

        System.out.println("After deleting the node at index 3");
        doubleLinkedList.deleteAt(3);
        System.out.println(doubleLinkedList);
        System.out.println(" ");

        index = 5;
        data  = doubleLinkedList.valueAt(index);
        System.out.println("The value at index "+index+" is "+data);
        System.out.println(doubleLinkedList);
        System.out.println(" ");


        System.out.println("The final List is ");
        System.out.println(doubleLinkedList);
    }

}
