import java.util.Collections;
import java.util.ArrayList;

public class SortedLinkedList<E extends Comparable<E>> {

    //A reference to the head of the list.
    private Node<E> head = null;

    //A Node is the building block for a single-linked list.
    private static class Node<E extends Comparable<E>> {
        private E data;
        private Node<E> next = null;

        /**
         * Constructs a new node that references another node.
         *
         * @param dataItem The data value
         * @param nodeRef  The node referenced by new node
         */
        private Node(E dataItem, Node<E> nodeRef) {
            data = dataItem;
            next = nodeRef;
        }
    } //end class Node

    //Methods

    /**
     * Returns the node at the given index
     * @param index the index of the node to return
     * @return the node at index
     * (Precondition: The index is valid)
     */
    private Node<E> getNode(int index) {
        Node<E> current = this.head;
        int i = 0;
        while (i != index && current != null) {
            current = current.next;
            i++;
        }
        return current;
    }

    /**
     * Returns the index where obj should be added to the
     * list.
     * @param obj The object to check.
     */
    private int indexForAdd(E obj) {
        //bubble sort to ensure that the list behaves itself ;)
        int size = 0;
        while(getNode(size) != null){
            size++;
        }
        int hold = 0;
        for(int i = 0; i < size; i++){
            for(int inner=1; inner < (size-i); inner++){
                E datA = getNode(inner-1).data;
                E datB = getNode(inner).data;
                if(datA.compareTo(datB) == 1){
                    getNode(inner-1).data = datB;
                    getNode(inner).data = datA;
                }
            }
        }
        int i = 0;
        while(getNode(i) != null) {
            i++;
        }
        return i;
    }

    /**
     * Adds an item to the list in ascending order.
     * @param obj The object to be inserted
     */
    public void add(E obj) {
        // NOTE: When you create a new Node, use the below format:
        // Node<E> n = new Node<>(... , ...);
        int index = indexForAdd(obj);
        if(head == null || index == 0){
            Node<E> newNode = new Node<E>(obj, head);
            head = newNode;
            return;
        }
        Node<E> curr = head;
        if(curr != null){
            for (int i = 0; i < index - 1 && curr.next != null; i++) {
                curr = curr.next;
            }
        }
        Node<E> toAdd = new Node<E>(obj, curr.next);
        curr.next = toAdd;
        indexForAdd(obj);
    }

    /**
     * Returns a string representation of the list
     * @return a string representation of the list
     */
    public String toString() {
        Node<E> temp = head;

        String toReturn = "[";

        while(temp != null) {
            toReturn += temp.data;

            if(temp.next != null)
                toReturn += ", ";

            temp = temp.next;
        }

        return toReturn + "]";
    }

}
