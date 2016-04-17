package Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lordni on 4/13/16.
 */
public class TrackList<T> implements TrackQueueInterface<T>{
    List<T> trackList = new ArrayList<>();

    @Override
    public T find(T itemToFind) {
        T itemReturn = null;
        for (T t: trackList) {
            if (t != null) {
                itemReturn = t;
            }
        }
        return itemReturn;
    }

    @Override
    public void add(T item) {
        trackList.add(item);
    }

    @Override
    public T popNextItem() {
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
