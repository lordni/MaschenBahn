package Interfaces;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lordni on 4/13/16.
 */
public class TrackHolderList<T> implements TrackHolderInterface<T>{

    private List<T> holderList = new ArrayList<>();

    @Override
    public T find(T itemToFind) {
        return null;
    }

    @Override
    public void add(T item) {
        holderList.add(item);
    }

    @Override
    public List<T> getList() {
        return holderList;
    }
}
