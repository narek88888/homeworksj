package homework15;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MyLinkedList implements List<Integer> {

    private int size;
    Node head;
    Node tail;


    static class Node{
        Node previous;
        Node next;
        Integer data;

        Node(Integer data){
            this.data = data;
            this.previous = null;
            this.next = null;
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean contains(Object o) {
        for (Node x = head; x != null; x = x.next) {
            if(x.equals(o)){
                return true;

            }
        }
        return false;
    }

    @Override
    public Iterator<Integer> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }


    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Integer integer) {
       Node newNode = new Node(integer);
       if(head == null){
           head = newNode;
           tail = newNode;

       }else {
           tail.next = newNode;
           newNode.previous = tail;
           tail = newNode;
       }
       size++;
       return true;
    }

    @Override
    /*
    TO DO
     */
    public boolean remove(Object o) {
        if(o == null) {
            for (Node i = head; i != null; i = i.next) {
                if(i.data == null){
                    Node previous = i.previous;
                    Node next = i.next;

                }
            }
        }else {
            for (Node i = head ; i != null ; i = i.next) {
                if(i.data.equals(o)){

                }
            }
        }
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for (Node i = head; i != null; i = i.next) {
            i = null;
        }
        size = 0;

    }

    @Override
    public Integer get(int index) {
        int y = 0;
        Integer value = 0;

        if(index < 0 || index >= size){
            return null;
        }
        for (Node x = head; x != null; x = x.next) {

            if(y == index){
                return x.data;
            }

            y++;

        }
        return null;

    }

    @Override
    public Integer set(int index, Integer element) {
        if(index < 0 || index >= size){
            return -1;
        }

        int y = 0;

        for(Node i = head; i != null ; i = i.next) {
            if(y == index){
                Integer v = i.data;
                i.data = element;
                return v;
            }
            y++;
        }
        return null;


    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
        int x = 0;

        if(index < 0 || index >= size){
            return -1;
        }
        for (Node i = head; i != null; i = i.next) {

            if(i.previous == null && x == index){
                head = i.next;
            }

            if(i.next == null && x == index){
                i.previous.next = null;
            }

            if(x == index){
                Integer v = i.data;
                i.previous.next = i.next;
                i = null;

                return v;
            }
        }
        return null;
    }

    @Override
    public int indexOf(Object o) {
        int y = 0;
        int index = 0;
        if(o == null) {
            for (Node i = head; i != null; i = i.next) {
                if(i.data == null){
                    return -1;
                }
            }
        }
        for (Node i = head; i != null; i = i.next) {
            if(o.equals(i.data)){
                index = y;
            }
            y++;
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Integer> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Integer> listIterator(int index) {
        return null;
    }

    @Override
    public List<Integer> subList(int fromIndex, int toIndex) {
        return List.of();
    }
}
