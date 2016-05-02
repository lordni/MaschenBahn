package Interfaces;

import Information.Destination;
import Model.Wagon;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class TrackList<T> implements TrackListInterface<T>, Comparable<T>{
    private List<T> trackList = new ArrayList<>();
    private final int MAXSIZE = 10;
    private String line = "";
    private Destination[] directions = null;
    private int directionCounter = 0;
    private int destinationNumber = 0;

    // THIS DOSN'T WORK PROPPER
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
        if(trackList.size() < MAXSIZE) {
            trackList.add(item);
        } else {
            throw new IndexOutOfBoundsException("There can not be added more wagons to this track");
        }
    }

    @Override
    public List<T> getList() {
        return trackList;
    }

    public List<T> sendOfWagons() {
        List<T> valueReturn = new ArrayList<>(trackList);
        clear();
        return valueReturn;
    }

    @Override
    public int getMAXSIZE() {
        return MAXSIZE;
    }

    @Override
    public boolean isEmpty() {
        return trackList.size() == 0;
    }

    @Override
    public String getLine() {
        return line;
    }

    @Override
    public Destination[] getDirections() {
        return directions;
    }

    @Override
    public int getDestinationNumber() {
        return destinationNumber;
    }

    @Override
    public void addDirection(Destination newDestination) {
        directions[directionCounter] = newDestination;
        directionCounter++;
    }

    // The first place to visit on this trip
    @Override
    public void setLine(String newLine) {
        line = newLine;
    }

    @Override
    public void clear() {
        trackList = new ArrayList<>();
        line = "";
        directions = null;
        directionCounter = 0;
        destinationNumber = 0;
    }

    @Override
    public int compareTo(T o) {
        return 0;
    }
}