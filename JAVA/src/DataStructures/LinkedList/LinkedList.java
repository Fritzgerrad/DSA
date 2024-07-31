package DataStructures.LinkedList;

import DataStructures.Node.Node;
import DataStructures.Node.SingleNode;

public interface LinkedList {
    public int getLength();
    public void add(int data);
    public void pop();
    public int find(int data);
    public Node nodeAt(int index);
    public int valueAt(int index);
    public void insertAt(int index, int value);
    public void deleteAt(int index);

    public static void test() {

    }

}

