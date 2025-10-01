package homework15;



import java.util.*;

public abstract class MyArrayList implements List<Integer> {

    private final int DEFAULT_CAPACITY = 10;
    int size = 0;
    Integer[] data = new Integer[DEFAULT_CAPACITY];




    @Override
    public int size() {
        size = 0;
        for (int i = 0; i < data.length; i++) {
            size = i;
        }
        return size;
    }

    @Override
    public boolean isEmpty() {
        boolean x;
        if(data.length == 0){
            x = true;
        }else {
            x = false;
        }
        return x;
    }

    @Override
    public boolean contains(Object o) {
        boolean x = false;
        for (int i = 0; i < data.length; i++) {
            if(data[i].equals(o)){
                x = true;
                break;
            }
        }
        return x;
    }



    @Override
    public Object[] toArray() {
        Integer[] array = new Integer[data.length];
        for (int i = 0; i < data.length; i++) {
            array[i] = data[i];
        }
        return array;
    }


/*
    @Override
    public boolean add(Integer integer) {
        if(size == data.length){
            int newCapacity = data.length * 2;
            Integer[] newData = new Integer[newCapacity];
            newData[data.length + 1] = integer;

        }
        return true;


    }


 */



    @Override
    public boolean remove(Object o) {
        boolean x = false;
        int index = -1;
        for (int i = 0; i < data.length; i++){
            if(data[i].equals(o)){
                index = i;
                x = true;
                break;
            }
        }

        if(index == -1){
            x = false;
        }

        for (int i = index; i < data.length; i++){
            data[i] = data[i + 1];
        }
        return x;
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
    public void clear() {
        for (int i = 0; i < data.length; i++) {
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
    public void add(int index, Integer element) {

    }

    @Override
    public Integer remove(int index) {
        int index_keeper = -1;
        for (int i = 0; i < data.length; i++) {
            if(i == index){
                index_keeper = i;
                break;
            }
        }

        if(index_keeper != -1){
            for (int j = index_keeper; j < data.length; j++) {
                data[j] = data[j + 1];
            }
        }
        return data[index];

    }

    @Override
    public int indexOf(Object o) {
        int index = 0;
        for (int i = 0; i < data.length; i++) {
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
        for (int i = 0; i < data.length; i++) {
            if(data[i].equals(o)){
                index = i;

            }
        }
        return index;

    }

}





