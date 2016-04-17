package Interfaces;

import java.util.Collection;
import java.util.List;

/**
 * Created by lordni on 4/13/16.
 */
public interface TrackQueueInterface<T> {
    public T find(T itemToFind);
    public void add(T item);
    public T popNextItem();
    public int size();
    public boolean isEmpty();
}
