package Interfaces;

/**
 * Created by lordni on 4/18/16.
 */
public interface TrackListInterface<T> extends TrackInterface<T> {
    public T popNextItem();
    public int size();
    public boolean isEmpty();
}
