package Interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by lordni on 4/13/16.
 */
public class TrackList<T extends Comparable<? super T>> implements TrackQueueInterface<T>{
    List<T> trackList = new ArrayList<>();
    @Override
    public T findWagon(T itemToFind) {
        T itemReturn = null;
        for (T t: trackList) {
            if (t.compareTo(itemToFind) == 0) {
                itemReturn = t;
            }
        }
        return itemReturn;
    }

    @Override
    public void addWagon(T item) {
        trackList.add(item);
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
