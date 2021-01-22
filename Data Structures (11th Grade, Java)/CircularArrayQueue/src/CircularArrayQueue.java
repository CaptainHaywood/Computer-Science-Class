public class CircularArrayQueue<E>  {

    private E[] theList;
    private int size;
    private int front;
    private int end;

    /**
     * Constructs a CircularArrayQueue
     */
    public CircularArrayQueue() {
        theList = (E[]) new Object[10];
        size = 0;
        front = -1;
        end = -1;
    }

    /**
     * Inserts the specified element to the end of the queue.
     * @param e the item to insert
     * @return always return true b/c we will increase capacity if necessary
     */
    public boolean offer(E e) {
        return true;
    }

    /**
     * Retrieves and removes the head of this queue. This method differs
     * from poll only in that it throws an exception if this queue is empty.
     * @return the item at the front of the queue, or throws NoSuchElementException if queue is empty
     */
    public E remove() {
        return null;
    }

    /**
     * Retrieves and removes the head of this queue, or returns null if this queue is empty.
     * @return the item at the front of the queue, or null if the queue is empty
     */
    public E poll() {
        return null;
    }

    /**
     * Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
     * @return the item at the front of the queue, or null if the queue is empty
     */
    public E peek() {
        return null;
    }

    /**
     * Retrieves, but does not remove, the head of this queue. This method differs from peek only
     * in that it throws an exception if this queue is empty.
     * @return the item at the front of the queue, or throws NoSuchElementException if the queue is empty
     */
    public E element() {
        return null;
    }

    /**
     * Reallocates space for the array. This method should double the length of theList, with the front
     * at cell index 0 and the end at index size-1.
     */
    private void reallocate() {

    }

    /**
     * Returns the length of the queue; teh number of cells allocated for the queue
     * @return the length of the queue
     */
    public int length() {
        return theList.length;
    }

    /**
     * Returns the size of the queue; the number of active elements in the queue
     * @return the size of the queue
     */
    public int size() {
        return size;
    }

}