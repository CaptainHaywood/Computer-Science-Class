import java.util.Iterator;

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
        if (index == 0) {
            addFirst(data);
        }
        else if (index == size - 1) {
            addLast(data);
        }
        else {
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            newNode.next = temp.next;
            temp.next.prev = newNode;
            temp.next = newNode;
            newNode.prev = temp;
        }
        size++;
    }

    public Node<E> removeFirst() {
        if (!isEmpty()) {
            Node<E> removed = head;
            head = head.next;
            head.prev = null;
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

    public Node<E> remove(int index) {
        if (!isEmpty()) {
            Node<E> removed = null;
            if (index == 0) {
                removed = removeFirst();
            }
            else if (index == size - 1) {
                removed = removeLast();
            }
            else {
                Node<E> temp = head;
                for (int i = 0; i < index - 1; i++) {
                    temp = temp.next;
                }
                removed = temp.next;
                temp.next = temp.next.next;
                temp.next.next.prev = temp;
                removed.next = null;
                removed.prev = null;
            }
            size--;
            return removed;
        }
        size--;
        return null;
    }

    public Iterator<E> iterator() {
        return new Iterator<E>() {
            Node<E> node = head;
            public boolean hasNext() {
                return node != null;
            }
            public E next() {
                E data = node.data;
                node = node.next;
                return data;
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
        E data = null;
        Node<E> temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        data = temp.next.data;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public int size() {
        return size;
    }
}