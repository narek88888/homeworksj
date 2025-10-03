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
       return true;
    }

    @Override
    public boolean remove(Object o) {
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

    }

    @Override
    public Integer get(int index) {
        for (Node x = head; x != null; x = x.next) {

        }
    }

    @Override
    public Integer set(int index, Integer element) {
        return 0;
    }

    @Override
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
        return 0;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
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
