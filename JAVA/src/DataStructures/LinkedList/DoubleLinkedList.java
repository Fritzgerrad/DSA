package DataStructures.LinkedList;

import DataStructures.Node.DoubleNode;
import DataStructures.Node.SingleNode;

public class DoubleLinkedList implements LinkedList{
    private DoubleNode head;
    private int length;

    public DoubleLinkedList(){
        this.head = null;
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
        } else{
            DoubleNode curr = this.head;
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(curr);

            return;


        }

    }

    @Override
    public void pop() {

    }

    @Override
    public int find(int data) {
        return 0;
    }

    @Override
    public DoubleNode nodeAt(int index) {
        return null;
    }

    @Override
    public int valueAt(int index) {
        return 0;
    }

    @Override
    public void insertAt(int index, int value) {

    }

    @Override
    public void deleteAt(int index) {

    }

    public static void test(){
        return;
    }

}
