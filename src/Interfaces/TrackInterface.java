package Interfaces;

import java.util.List;

/**
 * Created by lordni on 4/13/16.
 */
public interface TrackInterface<T> {
    public T find(T itemToFind);
    public void add(T item);
    public List<T> getList();
}
