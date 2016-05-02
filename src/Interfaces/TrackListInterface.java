package Interfaces;

import Information.Destination;

import java.util.List;

/**
 * Created by lordni on 4/18/16.
 */
public interface TrackListInterface<T> extends TrackInterface<T> {
    public List<T> sendOfWagons();
    public int getMAXSIZE();
    public boolean isEmpty();
    public String getLine();
    public Destination[] getDirections();
    public int getDestinationNumber();
    public void addDirection(Destination newDestination);
    public void setLine(String newLine);

    public void clear();
}
