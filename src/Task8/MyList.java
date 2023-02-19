package Task8;

public interface MyList <T> {

    int size();
    boolean isEmpty();
    boolean contains(T name);
    boolean add(T value);
    boolean add(int index, T value);
    boolean remove(T value);
    boolean addAll(MyList <? extends T> value);
    T get(int index);
    T remove(int index);
    T set(int index, T value);
    int indexOf(T value);




}
