import java.util.AbstractList;

public class MyArrayList<E> extends AbstractList<E> {
    private int size;
    private E[] theData;

    public MyArrayList(){
        size = 0;
        theData = (E[]) new Object [0];
    }

    @Override
    public E get(int index) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("" + index);
        }

        return theData[index];
    }

    @Override
    public int size() {
        return size;
    }

    public E set (int index, E element){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("" + index);

        theData[index] = element;
        return null;
    }

    public void add(int index, E element){

        if (index < 0 || index > size)

            throw new IndexOutOfBoundsException("" + index);

        E[] lazySolution;
        lazySolution = (E[]) new Object [theData.length+1];
        for (int i = 0; i < theData.length; i++) {
            lazySolution[i] = theData[i];
        }
        lazySolution[lazySolution.length-1] = element;
        theData = lazySolution;
        size++;

    }

    public E remove(int index){
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException("" + index);
        //we stan this implementation :)
        E[] lazySolution;
        lazySolution = (E[]) new Object [theData.length-1];
        for (int i = 0, k = 0; i < theData.length; i++) {
            if (i == index) {
                int nada = 0;
            }
            else{
                lazySolution[k++] = theData[i];
            }
        }
        theData = lazySolution;
        size--;
        return null;
    }
}
