import java.util.AbstractList;

public class MyArrayList<E> extends AbstractList<E> {
    private int size;
    private E[] theData;

    public MyArrayList(){
        size = 0;
        theData = (E[]) new Object [10];
    }

    @Override
    public E get(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("" + index);
        }

        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    public E set (int index, E element){
        return null;
    }

    public void add(int index, E element){

            // if index invalid, throw exception

            if (index < 0 || index > size)

                throw new IndexOutOfBoundsException("" + index);

                // if array is full, make more space

                // shift items, add element and update size

            System.arraycopy(theData, index, theData, index+1, size-index);

            theData[index] = element;

            size++;

        }

    public E remove(int index){
        return null;
    }
}
