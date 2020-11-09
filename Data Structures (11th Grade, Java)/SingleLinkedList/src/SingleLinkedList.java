public class SingleLinkedList<E> {

    private static class Node<E> {
        private E data;
        private Node<E> next;

        /**
         * Construct a node with the given data value and link
         * @param data - The data value
         * @param next - The link
         */
        public Node(E inData, Node<E> inNext) {
            data = inData;
            next = inNext;
        }
    }

    private Node<E> head = null;
    private int size = 0;

    // Helper Methods
    /** Insert an item as the first item of the list.
     *	@param item The item to be inserted
     */
    private void addFirst(E item) {
        // . . .
    }

    /**
     * Return the node at a specified index
     * @param index The index of the node sought
     * @returns The node at index or null if it does not exist
     */
    private Node<E> getNode(int index) {
        // . . .
        return null;
    }

    // Public Methods
    /**
     * Get the data value at index
     * @param index The index of the element to return
     * @returns The data at index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E get(int index) {
        // . . .
        return null;
    }

    /**
     * Set the data value at index
     * @param index The index of the item to change
     * @param newValue The new value
     * @returns The data value previously at index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E set(int index, E newValue) {
        // . . .
        return null;
    }

    /**
     * Insert the specified item at the specified position in the list.
     * Shifts the element currently at that position (if any) and any
     * subsequent elements to the right (adds one to their indicies)
     * @param index Index at which the specified item is to be inserted
     * @param item The item to be inserted
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public void add(int index, E item) {
        // . . .
    }

    /**
     * Append the specified item to the end of the list
     * @param item The item to be appended
     * @returns true (as specified by the Collection interface)
     */
    public boolean add(E item) {
        // . . .
        return true;
    }

    /**
     * Query the size of the list
     * @return The number of objects in the list
     */
    int size() {
        return size;
    }
    /**
     * Remove the specified item at the specified position in the list.
     * shifts any subsequent elements to the left (subtracts one from their indicies)
     * returns the data from the deleted index
     * @param index The index of the item to remove
     * @returns The data value previously at index
     * @throws IndexOutOfBoundsException if the index is out of range
     */
    public E remove(int index) {
        // . . .
        return null;
    }

    /**
     * Obtain a string representation of the list
     * @return A String representation of the list
     */
    @Override
    public String toString() {
        // . . .
        return null;
    }
}
