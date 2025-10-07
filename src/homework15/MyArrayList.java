package homework15;



import java.util.*;

public  class MyArrayList implements List<Integer> {

    private static final int DEFAULT_CAPACITY = 10;

    private Integer[] data;

    private int size;

    public MyArrayList(){
        this.data = new Integer[DEFAULT_CAPACITY];
    }

    public MyArrayList(int initialCapacity){
        if(initialCapacity > 0){
            this.data = new Integer[initialCapacity];
        }else if(initialCapacity == 0){
            this.data = new Integer[DEFAULT_CAPACITY];
        }else {
            throw new IllegalArgumentException("it can't be less than 0");
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
        if(o == null){
            for (int i = 0; i < size; i++) {
                if(data[i] == null){
                    return true;
                }

            }
        }else {
            for (int i = 0; i < size; i++) {
                if(data[i] == o){
                    return true;
                }
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
        Integer[] array = new Integer[data.length];
        for (int i = 0; i < size; i++) {
            array[i] = data[i];
        }
        return array;
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean remove(Object o) {

        int index = -1;
        for (int i = 0; i < size; i++){
            if(data[i].equals(o)){
                index = i;
                break;
            }
        }

        if(index == -1){
            return false;
        }
            for (int i = index; i < size; i++) {
                data[i] = data[i + 1];
            }
            data[size - 1] = null;
            size--;

        return true;

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
        for (int i = 0; i < size; i++) {
            data[i] = null;
            
        }
        size = 0;

    }

    @Override
    public Integer get(int index) {
        return data[index];
    }

    @Override
    public Integer set(int index, Integer element) {
        for (int i = 0; i < data.length; i++) {
            if(i == index){
                data[i] = element;
            }
        }
        return element;
    }



    @Override
    public boolean add(Integer integer) {
        if (size == data.length) {
            int newCapacity = data.length * 2;
            Integer[] newdata = new Integer[newCapacity];
            for (int i = 0; i < size; i++) {
                newdata[i] = data[i];
            }
            data = newdata;


        }
        data[size] = integer;
        size++;
        return true;

    }

    @Override
    public void add(int index, Integer element) {

        if(size == data.length ){
            int newCapacity = 2 * data.length;
            Integer[] newdata = new Integer[newCapacity];
            for (int i = 0; i < size; i++) {
                newdata[i] = data[i];
            }
            data = newdata;
            data[index] = element;

        }else {
            for (int i = index; i < size; i++) {
                data[i + 1] = data[i];
            }
            data[index] = element;

        }
        size++;
    }

    @Override
    public Integer remove(int index) {
        int index_keeper = -1;
        int removedElement = data[index];
        for (int i = 0; i < size; i++) {
            if(i == index){
                index_keeper = i;
                break;
            }
        }
        if(index_keeper != -1){
            for (int j = index_keeper; j < size - 1; j++) {
                data[j] = data[j + 1];
            }

        }else {
            return -1;
        }
        data[size - 1] = null;
        size--;

        return removedElement;


    }

    @Override
    public int indexOf(Object o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(data[i].equals(o)){
                index = i;
                break;
            }
        }
        return index;
    }

    @Override
    public int lastIndexOf(Object o) {
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(data[i].equals(o)){
                index = i;

            }
        }
        return index;

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

    @Override
    public String toString(){
        if(size ==0){
            return "[]";
        }

        StringBuilder sb = new StringBuilder();
        sb.append("[");

        for (int i = 0; i < size; i++) {
            sb.append(data[i]);

            if(i < size - 1){
                sb.append(", ");
            }
        }

        sb.append("]");

    return sb.toString();


    }

    public static void main(String[] args) {
        MyArrayList list1 = new MyArrayList(3);
        list1.add(10);
        list1.add(20);
        list1.add(30);

        System.out.println(list1.remove(0));
        Integer num1 = 20;
        Integer num2 = 30;
        System.out.println(list1.remove(num1));

        System.out.println(list1.toString());
        System.out.println(list1.get(0));
        System.out.println(list1.size());
        System.out.println(list1.indexOf(num2));
        System.out.println(list1.lastIndexOf(num2));
        list1.add(1,5);
        System.out.println(list1.toString());

    }

}





