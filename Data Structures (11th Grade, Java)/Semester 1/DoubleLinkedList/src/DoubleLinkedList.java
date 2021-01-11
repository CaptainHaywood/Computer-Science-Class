import java.util.Iterator;
import java.util.NoSuchElementException;

public class DoubleLinkedList<E> {
    Node<E> head;
    Node<E> tail;
    int size = 0;

    public DoubleLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void add(E s) {
        addLast(s);
        size++;
    }

    public class Node<E> {
        E data;
        Node<E> next;
        Node<E> prev;

        public Node(E data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(E data) {
        Node<E> newNode = new Node<E>(data);
        if (isEmpty()) {
            head = newNode;
            tail = null;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(E data) {
        Node<E> newNode = new Node<E>(data);
        Node<E> temp = head;

        if (isEmpty()) {
            addFirst(data);
        }
        else {
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void add(int index, E data) {
        Node<E> newNode = new Node<E>(data);
        Node<E> temp = head;
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("" + index);
        }
        if(head == null || index == 0){
            addFirst(data);
            size++;
            return;
        }
        if(index == size){
            addLast(data);
            size++;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
            size++;
        }

    public Node<E> removeFirst() {
        if (!isEmpty()) {
            Node<E> removed = head;
            head = head.next;
            //head.prev = null;
            removed.next = null;
            size--;
            return removed;
        }
        return null;
    }

    public Node<E> removeLast() {
        if (!isEmpty()) {
            Node<E> temp = head;
            while (temp.next.next != null) {
                temp = temp.next;
            }
            Node<E> removed = temp.next;
            tail = temp;
            tail.next = null;
            removed.prev = null;
            size--;
            return removed;
        }
        return null;
    }

    //AAAAAA
    public void remove(int index) {
        /*if(size == -1 && index  == 0){
            int n = 0;
        }*/
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException("" + index);
        }
        if (!isEmpty()) {
            Node<E> temp = head;
            Node<E> removed = temp;
            if (index == 0 || size == 1) {
                removed = removeFirst();
                //size--;
                return;
            }
            else if (index == size - 1) {
                removed = removeLast();
                //size--;
                return;
            }
            else {
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                removed = temp;
                if (head == removed) {
                    head = removed.next;
                }

                if (removed.next != null) {
                    removed.next.prev = removed.prev;
                }

                if (removed.prev != null) {
                    removed.prev.prev.next = removed.next;
                }

                removed = null;
            }
            size--;
            return;
        }
    }

    //welcome to the clown show
    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> node = head;
            Node<E> previous = null;
            Node<E> previousSquared = null;
            Boolean hasIterated = false;
            @Override
            public boolean hasNext() {
                return node != null;
            }
            @Override
            public E next() {
                if(node == null){
                    throw new NoSuchElementException();
                }
                E data = node.data;
                if(!hasNext()){
                    throw new NoSuchElementException();
                }
                previousSquared = previous;
                previous = node;
                node = node.next;
                hasIterated = true;
                return data;
            }
            @Override
            public void remove(){
                //System.out.println("called");
                if(!hasIterated){
                    throw new IllegalStateException("");
                }
                //if(node != null){
                    if(previous == null) {
                        head = head.next;
                        //System.out.println("route a");
                    }
                    if(previous.next == null && previousSquared != null){
                        //System.out.println("route nullnext");
                        previousSquared.next = null;
                    }
                    else {
                        //System.out.println("hit else");
                        if(previousSquared != null){
                            //System.out.println("route b");
                            previousSquared.next = previous.next;
                            previous.next = node.next;
                        }
                        else if(previousSquared == null){
                            //System.out.println("route c");
                            head = node;
                        }
                        else{
                            //System.out.println("route d");
                        }
                        previous = null;
                    }
                //}
                hasIterated = false;
            }
        };
    }

    public String toString() {
        String result = "[";
        Node<E> temp = head;
        while (temp != null) {
            if(temp.next == null){
                result += temp.data;
            }
            else{
                result += temp.data + ", ";
            }
            temp = temp.next;
        }
        result += "]";
        return result;
    }

    public E get(int index){
        if(index < 0 || index > size - 1){
            throw new IndexOutOfBoundsException("" + index);
        }
        E data = null;
        Node<E> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        if(size == 1){
            data = temp.data;
        }
        else{
            data = temp.next.data;
        }
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}