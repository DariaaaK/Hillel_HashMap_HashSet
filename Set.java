package HashMap_HashSet;

public interface Set<T> {
    boolean add(T element);
    boolean remove(T element);
    int size();
    void clear();
    boolean contains(T element);

}