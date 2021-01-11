public class SingleLinkedList<E> {
    //LETS GO THIS MF BITCH WORKS

    private static class Node<E> {
        private E data;
        private Node<E> next;

        /**
         * Construct a node with the given data value and link
         *
         * @param inData - The data value
         * @param inNext - The link
         */
        public Node(E inData, Node<E> inNext) {
            data = inData;
            next = inNext;
        }
    }

    private Node<E> head = null;
    private int size = 0;

    /**
     * Insert an item as the first item of the list.
     *
     * @param item The item to be inserted
     */
    private void addFirst(E item) {
        Node babyNode = new Node(item, head);
        head = babyNode;
        size++; //may or may not be important idek
    }

    /**
     * Return the node at a specified index
     *
     * @param index The index of the node sought
     * @returns The node at index or null if it does not exist
     */
    //DONE, not used?? god im such a clown
    private Node<E> getNode(int index) {
        if(index < 0 || index > size - 1 || size == 0){
            return null;
        }
        Node current = this.head;
        int i = 0;
        while (i != index) {
            current = current.next;
        }
        return (Node<E>) current;
    }

    // Public Methods

    /**
     * Get the data value at index
     *
     * @param index The index of the element to return
     * @throws IndexOutOfBoundsException if the index is out of range
     * @returns The data at index
     */
    //DONE + TEST OK
    public E get(int index) {
        if(index < 0 || index > size - 1 || size == 0){
            throw new IndexOutOfBoundsException("" + index);
        }
        Node current = null;
        if (head != null) {
            current = head;
            for (int i = 0; i < index; i++) {
                if (current == null)
                    return null;

                current = current.next;
            }
            return (E) current.data;
        }
        return (E) current;
    }

    /**
     * Set the data value at index
     *
     * @param index    The index of the item to change
     * @param newValue The new value
     * @throws IndexOutOfBoundsException if the index is out of range
     * @returns The data value previously at index
     */
    //DONE, TEST OK
    public E set(int index, E newValue) {
        if (index < 0 || index > size - 1 || size == 0) {
            throw new IndexOutOfBoundsException("" + index);
        }
        Node current = null;
        if (head != null) {
            current = head;
            for (int i = 0; i < index; i++) {
                if (current == null)
                    return null;
                current = current.next;
            }
            current.data = newValue;
        }
        return null;
    }

    /**
     * Insert the specified item at the specified position in the list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indicies)
     *
     * @param index Index at which the specified item is to be inserted
     * @param item  The item to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    //DONE, TEST OK
    public void add(int index, E item) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("" + index);
        }
        if(head == null || index == 0){
            addFirst(item);
            return;
        }
        Node current = head;
        if (current != null) {
            for (int i = 0; i < index - 1 && current.next != null; i++) {
                current = current.next;
            }
        }
        Node temp = new Node(item, current.next);
        current.next = temp;
        size++;
    }

    /**
     * Append the specified item to the end of the list
     *
     * @param item The item to be appended
     * @returns true (as specified by the Collection interface)
     */
    //DONE, TEST OK
    public boolean add(E item) {
        if (head == null) {
            head = new Node(item, head);
            size++;
            return true;
        }
        Node current = head;
        if (current != null) {
            while (current.next != null) {
                current = current.next;
            }
            Node temp = new Node(item, null);
            current.next = temp;
        }
        size++;
        return true;
    }

    /**
     * Query the size of the list
     *
     * @return The number of objects in the list
     */
    int size() {
        return size;
    }

    /**
     * Remove the specified item at the specified position in the list.
     * shifts any subsequent elements to the left (subtracts one from their indicies)
     * returns the data from the deleted index
     *
     * @param index The index of the item to remove
     * @throws IndexOutOfBoundsException if the index is out of range
     * @returns The data value previously at index
     */
    //DONE, TEST OK
    public E remove(int index) {
        if(index < 0 || index > size - 1 || size == 0){
            throw new IndexOutOfBoundsException("" + index);
        }

        Node current = this.head, prev = null;

        if (index == 0 && current != null) {
            this.head = current.next;
            size--;
            return null;
        }

        int i = 0;
        while (current != null) {
            if (i == index) {
                prev.next = current.next;
                break;
            }
            else {
                prev = current;
                current = current.next;
                i++;
            }
        }

        size--;
        return null;
    }

    /**
     * Obtain a string representation of the list
     *
     * @return A String representation of the list
     */
    //DONE
    @Override
    public String toString() {
        Node current = this.head;
        String result = "[";
        if(head == null){
            return "[]";
        }
        result = result + current.data;
        current = current.next;
        while (current != null) {
             result = result + ", " + current.data;
             current = current.next;
        }
        return result + "]";
    }
}
