package Interfaces;

import java.util.Collection;
import java.util.List;

/**
 * Created by lordni on 4/13/16.
 */
public interface TrackQueueInterface<T> {
    public T findWagon(T itemToFind);
    public void addWagon(T item);
    public T nextItemInTrack();
    public int size();
    public boolean isEmpty();
}
