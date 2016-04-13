package Interfaces;

/**
 * Created by lordni on 4/13/16.
 */
public class TrackHolderList<T extends Comparable<? super T>> implements TrackQueueInterface<T>{

    @Override
    public T findWagon(T itemToFind) {
        return null;
    }

    @Override
    public void addWagon(T item) {

    }

    @Override
    public T sendOfItem() {
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
