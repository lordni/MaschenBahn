package Model;

import Information.Destination;
import Information.DestinationDispatcher;

/**
 * Created by Henrik on 10-04-2016.
 */
public class Wagon extends Object
{
    public Destination getInformation() {
        return information;
    }

    private Destination information;

    // Creates all of our wagons
    public Wagon(){
        information = DestinationDispatcher.getADestination();
    }

    @Override
    public String toString()
    {
        return information.getName();
    }
}
