package Task8;

import java.util.Arrays;

public class MyArrayList <T> implements MyList{

    private T[] array;
    private int capacity = 10;

    @Override
    public int size() {
        int count = 0;
        for (T t : array) {
            if ( t != null){
                count++;
            }
        }
        return count;
    }

    @Override
    public boolean isEmpty() {
            if (size() == 0){
                return true;
            }
        return false;
    }

    @Override
    public boolean contains(Object name) {
        for (T t : array) {
            if ( t == name){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean add(Object value) {
        if (value == null){
            return false;
        }
            array[size()] = (T) value;
        return true;
    }

    @Override
    public boolean add(int index, Object value) {
        if (value == null){
            return false;
        }
        if (size() < index) {
            return false;
        } else {
            for (int i = size(); i >= index; i--) {
                array[i + 1] = array[i];
            }
            array[index] = (T) value;
        }
        return true;
    }

    @Override
    public boolean remove(Object value) {
        if (value == null){
            return false;
        }
        int count = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)){
                count = i;
                break;
            }
        }
        if (count != -1){
            for (int i = count; i < array.length-1; i++) {
                array[i] = array[i+1];
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean addAll(MyList  value) {
        for (int i = 0; i < value.size(); i++) {
                array[i + size()] = (T) value.get(i);
        }
        return true;
    }

    @Override
    public Object get(int index) {
        return array[index];
    }

    @Override
    public Object remove(int index) {
        T x = array[index];
        for (int i = index; i < array.length - 1; i++) {
            array[i] = array[i+1];
        }
        return x;
    }

    @Override
    public Object set(int index, Object value) {
        T x = array[index];
        array[index] = (T) value;
        return x;
    }

    @Override
    public int indexOf(Object value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals((T) value)  ){
                return i;
            }
        }
        return -1;
    }

    public MyArrayList(MyList <? extends T> col) {
        this.array = (T[]) new Object[capacity];
        for (int i = 0; i <= col.size() ; i++) {
            array[i] = col.get(i);
        }
    }

    public MyArrayList() {
        this.array = (T[]) new Object[capacity];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        this.array = (T[]) new Object[capacity];
    }

    @Override
    public String toString() {
        T[] arrayNew = (T[]) new Object[size()];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null){
                arrayNew[count] = array[i];
                count++;
            }
        }
        return  Arrays.toString(arrayNew);
    }
}
