package DataStructures.LinkedList;

import DataStructures.Node.SingleNode;

public class SingleLinkedList implements LinkedList{
    private SingleNode head;
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public SingleLinkedList() {
        this.head = null;
        this.length = 0;
    }
    public void add(int data) {
        SingleNode node = new SingleNode(data);
        this.length++;
        if (this.head == null){
            this.head = node;
            return;
        }
        else{
            SingleNode curr = this.head;
            while(curr.getNext() != null){
                curr = curr.getNext();
            }
            curr.setNext(node);
            return;
        }

    }

    public void pop(){
        if (this.head == null){
            return;
        }
        else{
            SingleNode curr = this.head;
            while(curr.getNext().getNext() != null){
                curr = curr.getNext();
            }
            SingleNode last = curr.getNext();
            last = null;
            curr.setNext(null);
            this.length--;
        }
    }

    public int find(int data){
        int pos = 0;
        if(this.head == null){
            //return 0 ? this.head.getValue() == data : -1;
            return -1;
        }
        else{
            SingleNode curr = this.head;
            while(curr != null){
                if (curr.getValue() == data){
                    return pos;
                }
                else{
                    curr = curr.getNext();
                    pos ++;
                }
            }
        }
        return -1;
    }

    public SingleNode nodeAt(int index){
        int pos = 0;
        if(this.length < index){
            //return 0 ? this.head.getValue() == data : -1;
            return null;
        }
        else{
            SingleNode curr = this.head;
            while(pos < index){
                curr = curr.getNext();
                pos ++;
            }
            return curr;
        }
    }

    public int valueAt(int index){
        SingleNode node  = this.nodeAt(index);
        if(node == null){
            return -1;
        }
        return node.getValue();
    }

    public void insertAt(int index, int value){
        SingleNode node = this.nodeAt(index -1);
        SingleNode newNode = new SingleNode(value);
        SingleNode temp = node.getNext();
        node.setNext(newNode);
        if(temp != null){
            newNode.setNext(temp);
        }
        this.length ++;
    }

    public void deleteAt(int index){
        SingleNode node = this.nodeAt(index - 1);
        SingleNode nextNode = node.getNext();
        SingleNode afterNext = nextNode.getNext();

        node.setNext(afterNext);
        nextNode = null;
        this.length --;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        SingleNode curr = this.head;
        while (curr.getNext() != null){
            str.append(curr.getValue());
            str.append("->");
            curr = curr.getNext();
        }
        str.append(curr.getValue());
        return str.toString();
    }

    public static void test(){
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        int [] test = {1,2,3,4,5,6,14,19,2,5,7};
        for (int i : test){
            singleLinkedList.add(i);
        }
        System.out.println("Initial Linked List");
        System.out.println(singleLinkedList);
        System.out.println(" ");

        System.out.println("After removing the last element");
        singleLinkedList.pop();
        System.out.println(singleLinkedList);
        System.out.println(" ");

        System.out.println("After inserting 30 at index 5");
        singleLinkedList.insertAt(5,30);
        System.out.println(singleLinkedList);
        System.out.println(" ");

        System.out.println("After deleting the node at index 3");
        singleLinkedList.deleteAt(3);
        System.out.println(singleLinkedList);
        System.out.println(" ");


        int data = 14;
        int index =singleLinkedList.find(data);
        System.out.println("The value at index "+index+" is "+data);
        System.out.println(" ");

        index = 5;
        data  = singleLinkedList.valueAt(index);
        System.out.println("The value at index "+index+" is "+data);
        System.out.println(" ");

        System.out.println("The final List is");
        System.out.println(singleLinkedList);

    }
}
