package Interfaces;

/**
 * Created by lordni on 4/13/16.
 */
public class TrackHolderList<T> implements TrackQueueInterface<T>{

    @Override
    public T findWagon(T itemToFind) {
        return null;
    }

    @Override
    public void addWagon(T item) {

    }

    @Override
    public T nextItemInTrack() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }
}
