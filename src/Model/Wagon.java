package Model;

import Information.Destination;

/**
 * Created by Henrik on 10-04-2016.
 */
public class Wagon
{
    private String destination;
    // Creates all of our wagons
    public Wagon(){
        destination = Destination.getDestination();
    }
}
