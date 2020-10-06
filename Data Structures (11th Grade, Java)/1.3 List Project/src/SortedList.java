import java.util.Arrays;

/**
 * Created by rritz on 9/26/2014.
 */
public class SortedList <E extends Comparable<E>> extends AbstractList<E>
{
    /**
     * Constructs a new SortedList with an allocation size of maxItems
     * @param maxItems the allocation size of the list
     */
    public SortedList(int maxItems) {
        theList = (E[]) new Comparable[maxItems];
    }

    /**
     * Adds obj to the list in ascending sorted order. Size is updated.
     * @param obj the object to add to the list
     * @return true if the add is successful, false otherwise
     */
    public boolean add(E obj) {
        if(isFull())
            return false;

        // TODO : Complete this method.

        return true;
    }

    /**
     * Return the index where obj is found in the list or negative number if not found
     * @param obj the object to search for in the list
     * @return the index where obj is found in the list or ( -(insertion point) - 1) if not found. For
     * example, if the array stores {5, 10, 15, 20} and the user searches for 12, the method
     * returns -3, which one less than the negative value of the insertion point. The insertion point
     * is defined as the point at which the key would be inserted into the array: the index of the
     * first element greater than the key, or a.length if all elements in the array are less than the
     * specified key. Note that this guarantees that the return value will be >= 0 if and only if the key
     * is found.
     */
    public int indexOf(E obj) {

        return Arrays.binarySearch(theList, 0, size, obj);
    }
}
