/**
 * Created by rritz on 9/26/2014.
 */
public abstract class AbstractList<E>
{
    protected E[] theList; // the list of values
    protected int size; // the number of elements in the list

    /**
     * Returns true if the list is full, false otherwise
     * @return true if the list is full, false otherwise
     */
    public boolean isFull() {
        return size ==  theList.length;
    }

    /**
     * Returns the number of objects in the list
     * @return the number of objects in the list
     */
    public int size() {
        return size;
    }

    /**
     * Returns a string representation of this collection. The string representation consists of a list in the order
     * they are stored, enclosed in square brackets ("[]"). Adjacent elements are separated by the characters ", "
     * (comma and space). Null values will be placed in empty cells. For example, if the list size is 5 and we have
     * "one", "two", and "three" in the list, the toString will be: "[one, two, three, null, null]"
     * @return a string representation of the list
     */
    public String toString() {
        String result = "[";
        for(int i = 0; i < theList.length; i++){
            if(theList[i] != null){
                result = result + theList[i];
            }
            else{
                result = result + "null";
            }
            if(i == theList.length - 1){
                result = result + "]";
            }
            else{
                result = result + ", ";
            }
        }
        return result;
    }

    public abstract boolean add(E obj);
    public abstract int indexOf(E obj);
    public boolean remove(E obj){
        int index = -1;
        for(int i = 0; i < size; i++){
            if(theList[i].equals(obj)){
                index = i;
            }
        }
        if(index == -1){
            return false;
        }
        else{
            System.arraycopy(theList, index + 1, theList, index, theList.length - 1 - index);
        }
        return true;
    }

}
