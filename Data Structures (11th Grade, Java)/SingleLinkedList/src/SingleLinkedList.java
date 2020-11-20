public class SingleLinkedList<E> {

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
    //should this even work??
    //my rapidly deteriorating sanity expressed in code comments ^
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
    //DONE
    private Node<E> getNode(int index) {
        if(index < 0 || index > size){
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
    //DONE
    public E get(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("" + index);
        }
        Node current = this.head;
        int i = 0;
        while (i != index) {
            current = current.next;
        }
        return (E) current.data;
    }

    /**
     * Set the data value at index
     *
     * @param index    The index of the item to change
     * @param newValue The new value
     * @throws IndexOutOfBoundsException if the index is out of range
     * @returns The data value previously at index
     */
    //DONE
    public E set(int index, E newValue) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("" + index);
        }
        Node current = this.head;
        int i = 0;
        while (i != index) {
            current = current.next;
        }
        Node newNode = new Node(newValue, current);
        current = newNode;
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
    //TODO ADD
    public void add(int index, E item) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("" + index);
        }
    }

    /**
     * Append the specified item to the end of the list
     *
     * @param item The item to be appended
     * @returns true (as specified by the Collection interface)
     */
    //idk how i made this work and its probably best to not question it
    public boolean add(E item) {
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        Node newNode = new Node(item, current);
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
    //DONE?
    public E remove(int index) {
        if(index < 0 || index > size){
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
        String result = "";
        while (current != null) {
            result = result + current.data;
            current = current.next;
        }
        return result;
    }
}
