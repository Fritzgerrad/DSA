package DataStructures.Node;

public class SingleNode implements Node{
    private SingleNode next;
    private int value;
    public SingleNode(SingleNode next, int value) {
        this.next = next;
        this.value = value;
    }
    public SingleNode(int value) {
        this.value = value;
        this.next = null;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

    @Override
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        String nextVal = this.next != null  ? Integer.toString(this.next.getValue()) : "";
        return this.getValue() + "|->" + nextVal;
    }
}
