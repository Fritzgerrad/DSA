package DataStructures.Node;

public class DoubleNode implements Node {
    private int value;
    private DoubleNode next;
    private DoubleNode prev;

    public DoubleNode(int value) {
        this.value = value;
        this.next = null;
        this.prev = null;
    }

    public DoubleNode(int value, DoubleNode next, DoubleNode prev) {
        this.value = value;
        this.next = next;
        this.prev = prev;
    }

    @Override
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public DoubleNode getPrev() {
        return prev;
    }

    public void setPrev(DoubleNode prev) {
        this.prev = prev;
    }

    public DoubleNode getNext() {
        return next;
    }

    public void setNext(DoubleNode next) {
        this.next = next;
    }
}
